package kindleclock.primary.di.config

import javax.inject.Inject
import javax.inject.Provider
import kindleclock.domain.model.config.redis.RedisConfiguration
import play.api.Configuration

class RedisConfigurationProvider @Inject() (
  configuration: Configuration
) extends Provider[RedisConfiguration] {
  private lazy val config =
    RedisConfiguration(
      configuration.get[String]("redis.host"),
      configuration.get[Int]("redis.port"),
      configuration.getOptional[String]("redis.password")
    )

  override def get(): RedisConfiguration = config
}
