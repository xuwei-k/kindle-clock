package kindleclock.infra.di

import com.google.inject.AbstractModule
import com.google.inject.TypeLiteral
import javax.inject.Inject
import kindleclock.infra.api.awair.AwairApiClientImpl
import kindleclock.infra.api.natureremo.NatureRemoApiClientImpl
import kindleclock.infra.api.openweathermap.OpenWeatherMapApiClientImpl
import kindleclock.infra.cache.redis.JedisClientProvider
import kindleclock.infra.cache.redis.RedisCacheClientJedisImpl
import kindleclock.infra.datamodel.awair.AwairDataModel
import kindleclock.domain.interfaces.infra.api.awair.AwairApiClient
import kindleclock.domain.interfaces.infra.api.natureremo.NatureRemoApiClient
import kindleclock.domain.interfaces.infra.api.openweathermap.OpenWeatherMapApiClient
import kindleclock.domain.interfaces.infra.cache.CacheClient
import kindleclock.infra.cache.redis.BinaryFormat
import kindleclock.infra.datamodel.awair.AwairDataModel
import kindleclock.infra.di.InfraModule.RedisCacheClientJedisImplAwairDataModel
import redis.clients.jedis.Jedis
import scala.concurrent.ExecutionContext

class InfraModule extends AbstractModule {
  override def configure(): Unit = {
    bind(classOf[Jedis]).toProvider(classOf[JedisClientProvider])
    bind(new TypeLiteral[CacheClient[AwairDataModel]]() {}).to(
      classOf[RedisCacheClientJedisImplAwairDataModel]
    )
    bind(classOf[AwairApiClient]).to(classOf[AwairApiClientImpl])
    bind(classOf[NatureRemoApiClient]).to(classOf[NatureRemoApiClientImpl])
    bind(classOf[OpenWeatherMapApiClient]).to(classOf[OpenWeatherMapApiClientImpl])
  }
}

object InfraModule {

  /** @note
    *   Guice cannot find `BinaryFormat[AwairDataModel]` instance because Guice works on runtime instead of compile
    *   time. This class defines at compile time so the Scala compiler can find the instance and then success
    *   instantiation.
    */
  class RedisCacheClientJedisImplAwairDataModel @Inject() (
    jedis: Jedis
  )(implicit ec: ExecutionContext)
    extends RedisCacheClientJedisImpl[AwairDataModel](jedis)
}
