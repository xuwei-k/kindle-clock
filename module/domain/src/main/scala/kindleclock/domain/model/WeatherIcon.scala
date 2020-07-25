package kindleclock.domain.model

import scala.xml.Elem

sealed abstract class WeatherIcon(
  val svg: Elem
) extends Product
  with Serializable

/**
  * @see [[https://github.com/mpetroff/kindle-weather-display]]
  *      [[https://mpetroff.net/2012/09/kindle-weather-display/]]
  */
object WeatherIcon {
  case object Sunny
    extends WeatherIcon(
      <svg xmlns="http://www.w3.org/2000/svg" height="100" width="100">
      <path d="M47.812,0v17.062h4.469v-17.062h-4.469zm-19.718,4.875l-3.782,2.375,9,14.438,3.782-2.344-9-14.469zm44.187,0.4375l-8.25,14.906,3.938,2.187,8.219-14.906-3.907-2.1875zm-63.625,16.25l-2.1874,3.938,14.843,8.25,2.188-3.906-14.844-8.282zm41.406,0.657c-15.25,0-27.624,12.417-27.624,27.719,0,15.3,12.374,27.721,27.624,27.718,15.24,0,27.594-12.416,27.594-27.718s-12.356-27.719-27.594-27.719zm41.75,0.531l-14.718,8.531,2.218,3.907,14.719-8.532-2.219-3.906zm-91.812,23.688v4.468h17v-4.468h-17zm83,0.25v4.5h17v-4.5h-17zm-63.594,15.687l-14.406,9.031,2.3438,3.813,14.406-9.063-2.344-3.781zm60.5,0.969l-2.187,3.906,14.875,8.281,2.187-3.937-14.875-8.25zm-11.312,13.625l-3.875,2.219,8.5,14.781,3.875-2.25-8.5-14.75zm-37.156,0.093l-8.25,14.938,3.906,2.156,8.25-14.937-3.906-2.157zm16.093,5.876v17.062h4.469v-17.062h-4.469z"/>
    </svg>
    )

  case object SunnyWithCloud
    extends WeatherIcon(
      <svg xmlns="http://www.w3.org/2000/svg" height="100" width="100">
      <path d="M33.469,15v11.938h3.125v-11.938h-3.125zm-13.813,3.406l-2.656,1.656,6.312,10.126,2.657-1.657-6.313-10.125zm30.938,0.313l-5.782,10.437,2.75,1.532,5.782-10.438-2.75-1.531zm-44.532,11.375l-1.5313,2.75,10.407,5.781,1.5-2.75-10.376-5.781zm28.968,0.468c-10.675,0-19.312,8.695-19.312,19.407,0,9.054,6.173,16.619,14.531,18.75-3.104,1.593-5.25,4.819-5.25,8.531,0,2.64,1.214,4.853,3.062,6.094,1.508,1.012,3.31,1.457,5.219,1.594v0.062h1.313,1.812,22.75,13.375,12.281c8.363,0,15.188-6.823,15.188-15.188,0-8.364-6.824-15.156-15.188-15.156-1.204,0-2.335,0.198-3.437,0.469-2.148-7.959-9.313-13.875-17.937-13.875-3.692,0-7.108,1.081-10,2.938-2.449-7.888-9.748-13.626-18.407-13.626zm29.219,0.376l-10.281,5.968,1.562,2.719,10.313-5.969-1.594-2.718zm-0.812,13.874c7.565,0,13.762,5.572,14.906,12.813l0.312,2.156,2.063-0.781c1.3-0.493,2.668-0.781,4.093-0.781,6.436,0,11.626,5.159,11.626,11.593,0,6.435-5.191,11.626-11.626,11.626h-12.281-13.375-24.562c-1.933,0-3.553-0.406-4.532-1.063-0.978-0.657-1.5-1.449-1.5-3.125,0-3.347,2.681-6.031,6.032-6.031,0.554,0,1.13,0.126,1.75,0.312l2.281,0.688v-2.407-0.187c0-4.067,3.246-7.313,7.313-7.313-0.059,0,0.097,0.036,0.5,0.063l2,0.125-0.094-2c-0.022-0.488-0.063-0.646-0.063-0.531,0-8.384,6.767-15.157,15.157-15.157zm-63.438,2.688v3.125h11.906v-3.125h-11.906zm13.562,11.156l-10.062,6.344,1.625,2.656,10.094-6.344-1.657-2.656zm8.438,10.282l-5.75,10.468,2.719,1.5,5.781-10.437-2.75-1.531z"/>
    </svg>
    )

  case object CloudyWithSun
    extends WeatherIcon(
      <svg xmlns="http://www.w3.org/2000/svg" height="100" width="100">
      <path d="M33.469,15v11.938h3.125v-11.938h-3.125zm-13.813,3.406l-2.656,1.656,6.312,10.126,2.657-1.657-6.313-10.125zm30.938,0.313l-4.719,8.531c-2.986,0.663-5.776,1.865-8.25,3.5-0.847-0.119-1.715-0.188-2.594-0.188-10.675,0-19.312,8.695-19.312,19.407,0,1.947,0.305,3.825,0.843,5.593-0.978,1.235-1.775,2.642-2.312,4.157l-0.688-1.063-10.062,6.344,0.3438,0.562c-2.3766,2.331-3.8438,5.561-3.8438,9.126,0,3.52,1.6295,6.439,4.0938,8.093,2.4642,1.654,5.5401,2.219,8.7182,2.219h20.469,3.125,9.125,17.844,16.375c11.15,0,20.25-9.098,20.25-20.25s-9.099-20.219-20.25-20.219c-1.607,0-3.124,0.264-4.594,0.625-2.866-10.607-12.411-18.5-23.906-18.5-0.499,0-0.977,0.034-1.469,0.063l3.563-6.469-2.75-1.531zm-44.532,11.375l-1.5313,2.75,10.407,5.781,1.5-2.75-10.376-5.781zm45.188,1.344c10.088,0,18.319,7.377,19.844,17.031l0.468,2.906,2.75-1.031c1.734-0.658,3.538-1.063,5.438-1.063,8.58,0,15.5,6.89,15.5,15.469s-6.921,15.5-15.5,15.5h-16.375-17.844-32.719c-2.576,0-4.757-0.53-6.062-1.406s-2-1.922-2-4.156c0-4.463,3.5946-8.032,8.062-8.032,0.74,0,1.486,0.128,2.313,0.375l3.063,0.938v-3.219c0-0.288,0.007-0.458,0-0.5,0.133-5.302,4.412-9.5,9.75-9.5-0.078,0,0.118,0.026,0.656,0.062l2.656,0.188-0.125-2.656c-0.029-0.651-0.063-0.871-0.063-0.719,0-11.178,9.002-20.187,20.188-20.187zm-51.25,16.062v3.125h11.906v-3.125h-11.906z"/>
    </svg>
    )

  case object Cloudy
    extends WeatherIcon(
      <svg xmlns="http://www.w3.org/2000/svg" height="100" width="100">
      <path d="M51.312,21.875c-5.183,0-9.974,1.68-13.874,4.5h27.687c-3.879-2.82-8.642-4.5-13.813-4.5zm-18.312,8.625c-1.135,1.375-2.102,2.891-2.906,4.5h42.312c-0.806-1.614-1.771-3.121-2.906-4.5h-36.5zm-4.5,8.625c-0.41,1.451-0.686,2.95-0.812,4.5h63.718c-2.932-1.897-6.403-3-10.156-3-2.34,0-4.568,0.47-6.625,1.25-0.15-0.948-0.368-1.843-0.625-2.75h-45.5zm-7.438,8.625c-2.041,1.037-3.774,2.58-5,4.5h82.532c-0.668-1.626-1.551-3.141-2.625-4.5h-74.907zm-6.718,8.625c-0.192,0.879-0.282,1.814-0.282,2.75,0,0.087,0.032,0.163,0.032,0.25-1.008-0.302-2.054-0.531-3.156-0.531-2.3633,0-4.5566,0.758-6.3442,2.031h95.344c0.039-0.499,0.062-0.991,0.062-1.5,0-1.025-0.092-2.02-0.25-3h-85.406zm-13.25,8.625c-0.66557,1.366-1.0531,2.889-1.0938,4.5h97.031c0.893-1.385,1.589-2.896,2.094-4.5h-98.031zm-0.25005,8.625c1.6598,3.194,5.5614,4.5,10.094,4.5h70.312c4.652,0,8.91-1.698,12.188-4.5h-92.594z"/>
    </svg>
    )

  case object Rainy
    extends WeatherIcon(
      <svg xmlns="http://www.w3.org/2000/svg" height="100" width="100">
      <path d="M51.312,4.6875c-13.094,0-23.718,10.6-23.718,23.688,0,0.296,0.08,0.579,0.094,0.875-0.296-0.02-0.58-0.094-0.876-0.094-7.044,0-12.75,5.705-12.75,12.75,0,0.087,0.032,0.163,0.032,0.25-1.008-0.302-2.054-0.5-3.156-0.5-6.0435,0-10.938,4.901-10.938,10.938,0,6.043,4.8945,8.344,10.938,8.344h70.312c10.358,0,18.75-8.392,18.75-18.75,0-10.36-8.391-18.75-18.75-18.75-2.34,0-4.568,0.47-6.625,1.25-1.788-11.322-11.495-20-23.313-20zm-9.562,59.594c-0.973,0.049-1.864,0.653-2.219,1.625-0.473,1.297,0.204,2.745,1.5,3.219,1.297,0.473,2.745-0.203,3.219-1.5s-0.203-2.745-1.5-3.219c-0.324-0.118-0.676-0.141-1-0.125zm34.438,0c-0.973,0.049-1.864,0.653-2.219,1.625-0.474,1.297,0.203,2.745,1.5,3.219,1.296,0.473,2.714-0.203,3.187-1.5,0.474-1.297-0.172-2.745-1.468-3.219-0.325-0.118-0.676-0.141-1-0.125zm-52.126,1c-0.778,0.039-1.497,0.535-1.781,1.313-0.379,1.037,0.182,2.183,1.219,2.562s2.184-0.181,2.562-1.218c0.379-1.038-0.181-2.184-1.218-2.563-0.26-0.095-0.522-0.107-0.782-0.094zm34.438,0c-0.778,0.039-1.497,0.535-1.781,1.313-0.379,1.037,0.15,2.183,1.187,2.562,1.038,0.379,2.184-0.181,2.563-1.218,0.379-1.038-0.151-2.184-1.188-2.563-0.259-0.095-0.522-0.107-0.781-0.094zm-19.125,5.5c-0.973,0.049-1.864,0.684-2.219,1.657-0.473,1.296,0.204,2.713,1.5,3.187,1.297,0.473,2.714-0.203,3.188-1.5,0.473-1.297-0.172-2.714-1.469-3.187-0.324-0.119-0.676-0.173-1-0.157zm34.437,0c-0.972,0.049-1.863,0.684-2.218,1.657-0.474,1.296,0.203,2.713,1.5,3.187,1.296,0.473,2.714-0.203,3.187-1.5,0.474-1.297-0.203-2.714-1.5-3.187-0.324-0.119-0.644-0.173-0.969-0.157zm-52.124,1c-0.779,0.039-1.498,0.535-1.782,1.313-0.379,1.037,0.151,2.183,1.188,2.562s2.215-0.15,2.594-1.187c0.378-1.038-0.182-2.184-1.219-2.563-0.26-0.094-0.522-0.138-0.781-0.125zm34.437,0c-0.778,0.039-1.497,0.535-1.781,1.313-0.379,1.037,0.15,2.183,1.187,2.562,1.038,0.379,2.184-0.15,2.563-1.187,0.379-1.038-0.151-2.184-1.188-2.563-0.259-0.094-0.522-0.138-0.781-0.125zm-19.125,5.5c-0.973,0.049-1.864,0.684-2.219,1.657-0.473,1.296,0.204,2.745,1.5,3.218,1.297,0.474,2.714-0.203,3.188-1.5,0.473-1.296-0.172-2.745-1.469-3.218-0.324-0.119-0.676-0.173-1-0.157zm34.438,0c-0.973,0.049-1.864,0.684-2.219,1.657-0.474,1.296,0.172,2.745,1.469,3.218,1.296,0.474,2.745-0.203,3.218-1.5,0.474-1.296-0.203-2.745-1.5-3.218-0.324-0.119-0.644-0.173-0.968-0.157zm-52.126,1c-0.778,0.039-1.497,0.535-1.781,1.313-0.379,1.037,0.151,2.215,1.188,2.594,1.037,0.378,2.183-0.182,2.562-1.219,0.379-1.038-0.15-2.184-1.187-2.563-0.26-0.094-0.522-0.138-0.782-0.125zm34.438,0c-0.778,0.039-1.497,0.535-1.781,1.313-0.379,1.037,0.15,2.215,1.187,2.594,1.038,0.378,2.184-0.182,2.563-1.219,0.379-1.038-0.151-2.184-1.188-2.563-0.259-0.094-0.522-0.138-0.781-0.125zm-19.125,5.531c-0.973,0.049-1.864,0.653-2.219,1.626-0.473,1.296,0.204,2.745,1.5,3.218,1.297,0.474,2.714-0.203,3.188-1.5,0.473-1.296-0.204-2.714-1.5-3.187-0.324-0.119-0.645-0.173-0.969-0.157zm34.437,0c-0.972,0.049-1.863,0.653-2.218,1.626-0.474,1.296,0.172,2.745,1.468,3.218,1.297,0.474,2.746-0.203,3.219-1.5,0.474-1.296-0.203-2.714-1.5-3.187-0.324-0.119-0.644-0.173-0.969-0.157zm-52.124,1c-0.779,0.039-1.498,0.535-1.782,1.313-0.379,1.037,0.151,2.184,1.188,2.563,1.037,0.378,2.183-0.151,2.562-1.188s-0.15-2.184-1.187-2.562c-0.26-0.095-0.522-0.138-0.781-0.126zm34.437,0c-0.778,0.039-1.497,0.535-1.781,1.313-0.379,1.037,0.15,2.184,1.187,2.563,1.038,0.378,2.184-0.151,2.563-1.188s-0.151-2.184-1.188-2.562c-0.259-0.095-0.522-0.138-0.781-0.126zm-24.844,2.219c-1.38,0-2.5,1.12-2.5,2.5,0,1.381,1.12,2.5,2.5,2.5,1.381,0,2.5-1.119,2.5-2.5,0-1.38-1.119-2.5-2.5-2.5zm34.438,0c-1.381,0-2.5,1.12-2.5,2.5,0,1.381,1.119,2.5,2.5,2.5,1.38,0,2.5-1.119,2.5-2.5,0-1.38-1.12-2.5-2.5-2.5zm-52.156,1c-1.1046,0-2,0.896-2,2,0,1.105,0.8954,2,2,2s1.9995-0.895,1.9995-2c0-1.104-0.8949-2-1.9995-2zm34.438,0c-1.105,0-2,0.896-2,2,0,1.105,0.895,2,2,2s2-0.895,2-2c0-1.104-0.895-2-2-2zm-11,2.281c-0.973,0.049-1.864,0.684-2.219,1.657-0.473,1.296,0.172,2.714,1.469,3.187,1.297,0.474,2.745-0.172,3.219-1.468,0.473-1.297-0.204-2.746-1.5-3.219-0.324-0.119-0.645-0.173-0.969-0.157zm34.438,0c-0.973,0.049-1.864,0.684-2.219,1.657-0.474,1.296,0.172,2.714,1.469,3.187,1.296,0.474,2.745-0.172,3.218-1.468,0.474-1.297-0.203-2.746-1.5-3.219-0.324-0.119-0.644-0.173-0.968-0.157zm-52.126,1c-0.778,0.039-1.497,0.535-1.781,1.313-0.379,1.037,0.151,2.184,1.188,2.563,1.037,0.378,2.183-0.151,2.562-1.188s-0.15-2.184-1.187-2.562c-0.26-0.095-0.522-0.138-0.782-0.126zm34.438,0c-0.778,0.039-1.497,0.535-1.781,1.313-0.379,1.037,0.15,2.184,1.187,2.563,1.038,0.378,2.184-0.151,2.563-1.188s-0.151-2.184-1.188-2.562c-0.259-0.095-0.522-0.138-0.781-0.126z"/>
    </svg>
    )

  case object RainyWithSun
    extends WeatherIcon(
      <svg xmlns="http://www.w3.org/2000/svg" height="100" width="100">
      <path d="m73.078,1.875,0,8.5312,2.2188,0,0-8.5312-2.2188,0zm-9.875,2.4062-1.875,1.2188,4.5,7.2188,1.9062-1.1875-4.5312-7.25zm22.125,0.25-4.125,7.4375,1.9375,1.0938,4.125-7.4688-1.9375-1.0625zm-31.844,8.125-1.0625,1.9375,7.4062,4.1562,1.0938-1.9688-7.4375-4.125zm20.719,0.3125c-7.625,0-13.812,6.224-13.812,13.875,0,7.65,6.1875,13.845,13.812,13.844,7.619,0,13.781-6.1928,13.781-13.844,0-7.65-6.1622-13.875-13.781-13.875zm20.875,0.28125-7.375,4.25,1.125,1.9688,7.375-4.2812-1.125-1.9375zm-45.906,11.812,0,2.25,8.5,0,0-2.25-8.5,0zm41.5,0.15625,0,2.2188,8.5,0,0-2.2188-8.5,0zm-31.812,7.8125-7.1875,4.5312,1.1562,1.9062,7.2188-4.5312-1.1875-1.9062zm30.25,0.5-1.0625,1.9688,7.4062,4.125,1.0938-1.9688-7.4375-4.125zm-54.094,3.5625c-8.8406,0-15.952,7.0403-16.469,15.75-4.3198,0.41518-7.666,3.6658-8.4375,7.875-0.25345-0.02661-0.4506-0.125-0.71875-0.125-4.6961,0-8.5625,3.8389-8.5625,8.5312,0,2.3476,1.108,4.3341,2.75,5.4375,1.6436,1.1041,3.6939,1.4688,5.8125,1.4688h21.812,11.875,10.938c7.4348,0,13.5-6.0639,13.5-13.5s-6.0638-13.5-13.5-13.5c-1.1286,0-2.1604,0.29785-3.1875,0.5625-1.8785-7.1211-8.1131-12.5-15.812-12.5zm0,3.1875c6.7262,0,12.201,4.9699,13.219,11.406l0.3125,1.9375,1.8438-0.75c1.1552-0.43828,2.3578-0.65625,3.625-0.65625,5.7208,0,10.344,4.5931,10.344,10.312,0,5.7208-4.6229,10.312-10.344,10.312h-10.938-11.875-21.812c-1.7188,0-3.1608-0.35219-4.0312-0.9375-0.8702-0.58322-1.3438-1.2907-1.3438-2.7812,0-2.9749,2.3959-5.3438,5.375-5.3438,0.49359,0,0.94969,0.08547,1.5,0.25l2.0938,0.625v-2.125c0-0.09802-0.0576-0.10094-0.0625-0.15625,0-0.08962-0.008-0.1047,0-0.125-0.001-0.0084,0.001-0.02845,0-0.03125,0.0833-3.5413,2.9391-6.375,6.5-6.375-0.0518,0,0.14013,0.0373,0.5,0.0625l1.75,0.09375-0.0625-1.75c-0.01274-0.28261-0.06568-0.42474-0.09375-0.46875,0-0.02538-0.0087-0.03558,0-0.03125,0.01709-7.4384,6.052-13.469,13.5-13.469zm48.438,0.0625-1.9062,1.125,4.25,7.375,1.9062-1.125-4.25-7.375zm-18.562,0.0625-4.125,7.4375,1.9688,1.0938,4.125-7.4688-1.9688-1.0625zm8.0625,2.9375,0,8.5312,2.2188,0,0-8.5312-2.2188,0zm-57.344,36.938-6.3438,17.344,1.375,0.5,6.5-17.844-1.5312,0zm12.031,0-6.3125,17.344,1.3438,0.5,6.5-17.844-1.5312,0zm12.062,0-6.3125,17.344,1.3438,0.5,6.5-17.844-1.5312,0zm12.031,0-6.2812,17.344,1.3438,0.5,6.5-17.844-1.5625,0z"/>
    </svg>
    )

  case object Snowing
    extends WeatherIcon(
      <svg xmlns="http://www.w3.org/2000/svg" height="100" width="100">
      <path d="m42.732,50.287,3.955,5.841,7.365,0,3.398-5.841-3.58-6.22-7.379,0zm3.033,46.974,0-13.207-7.379,4.15-3.759-2.152,0-4.653,10.943-6.22,0-8.68-7.939,5.102,0-9.196-7.589,4.374,0,12.468-4.151,2.572-3.508-2.321,0-8.356-11.518,6.498-4.919-2.07,0-5.27,12.089-6.609-7.561-3.801,0-4.822,4.291-2.349,10.845,6.386,7.533-4.346-0.182-0.139-7.701-4.417,7.477-4.64-7.505-4.346-10.844,6.372-4.068-2.026,0-4.808,7.339-4.123-11.713-6.36,0-5.269,4.5-2.319,11.544,6.666,0-8.497,3.48-2.348,4.264,2.46-0.028,12.718,7.756,4.43-0.027-8.986,8.134,4.375,0-8.68-10.943-6.233,0-4.612,3.759-2.18,7.379,4.151,0-13.18,4.222-2.768,4.261,2.768,0,13.18,7.646-4.235,3.845,2.544,0,4.151-11.322,6.414,0,8.68,7.744-4.724,0,9.448,7.979-4.348,0-13.598,3.844-1.789,4.038,1.789,0,8.694,11.879-6.416,4.153,2.53,0,4.919-11.601,6.597,7.254,4.066,0,4.697-3.76,2.083-11.138-6.583-7.702,4.892,7.449,4.642-7.673,4.416,7.926,4.15,11.138-6.221,3.578,2.53,0,4.487-6.988,3.927,11.126,6.61,0,5.188-4.71,2.152-10.931-6.221,0,8.232-3.927,2.194-3.843-2.194,0-12.496-8.092-4.611,0,8.68-7.744-4.725,0,8.68,10.944,6.22,0,4.92-3.776,1.886-7.337-4.15,0,13.207-4.26,2.738z"/>
    </svg>
    )

  case object Thunder
    extends WeatherIcon(
      <svg xmlns="http://www.w3.org/2000/svg" height="100" width="100">
      <path d="M51.312,3.5625c-13.094,0-23.718,10.63-23.718,23.718,0,0.296,0.08,0.548,0.094,0.844-0.296-0.02-0.58-0.063-0.876-0.063-7.044,0-12.75,5.706-12.75,12.75,0,0.088,0.032,0.164,0.032,0.25-1.008-0.302-2.054-0.5-3.156-0.5-6.0435,0-10.938,4.901-10.938,10.938,0,6.043,4.8945,8.312,10.938,8.312h70.312c10.358,0,18.75-8.39,18.75-18.75,0-10.358-8.391-18.75-18.75-18.75-2.34,0-4.568,0.502-6.625,1.282-1.788-11.321-11.495-20.032-23.313-20.032zm-4.593,58.656l-11.969,20.531h8.562l-6.843,13.688,20.531-20.532h-10.281l8.562-13.687h-8.562zm-23.25,3.781l-9.031,24.812,1.937,0.719,9.313-25.531h-2.219zm10.343,0l-9.031,24.812,1.938,0.719,9.281-25.531h-2.188zm30.969,0l-9.031,24.812,1.938,0.719,9.281-25.531h-2.188zm10.313,0l-9,24.812,1.937,0.719,9.281-25.531h-2.218z"/>
    </svg>
    )

  case object Mist
    extends WeatherIcon(
      <svg xmlns="http://www.w3.org/2000/svg" height="100" width="100">
      <path d="m51.312,5.9375c-5.183,0-9.975,1.68-13.875,4.5h27.688c-3.879-2.82-8.6415-4.5-13.812-4.5zm-18.312,8.6245c-1.135,1.375-2.1022,2.891-2.9062,4.5h42.312c-0.806-1.614-1.7712-3.121-2.9062-4.5h-36.5zm-4.5,8.625c-0.41,1.451-0.6865,2.95-0.8125,4.5h12.469v4.125h-19.094c-2.041,1.037-3.774,2.58-5,4.5h24.094v4.125h-25.812c-0.192,0.879-0.28125,1.814-0.28125,2.75,0,0.087,0.03125,0.163,0.03125,0.25-1.008-0.302-2.0542-0.53125-3.1562-0.53125-2.3633,0-4.5562,0.75825-6.3438,2.0312h35.562v4.125h-6.25v-3.6875h-20.406v3.6875h-12.406c-0.66682,1.366-1.0543,2.89-1.095,4.5h13.5v4.125h-12.656c1.6598,3.194,5.5611,4.5,10.094,4.5h2.5625v21.281h-13.5v10.594h100v-10.594h-12.75v-22.312c2.2843-0.7748,4.3939-1.9356,6.1875-3.4688h-6.1875v-4.125h9.7812c0.893-1.385,1.5888-2.896,2.0938-4.5h-35.406v-4.125h36.219c0.039-0.499,0.0625-0.991,0.0625-1.5,0-1.025-0.092-2.02-0.25-3h-36.031v-4.125h34.875c-0.668-1.626-1.551-3.141-2.625-4.5h-32.25v-4.125h27.688c-2.932-1.897-6.4032-3-10.156-3-2.34,0-4.568,0.47-6.625,1.25-0.15-0.948-0.368-1.843-0.625-2.75h-45.5zm14.094,6.3438,7.4375,0,0,2.2812-7.4375,0,0-2.2812zm11.25,0,7.4375,0,0,2.2812-7.4375,0,0-2.2812zm-11.25,8.125,7.4375,0,0,2.7812-7.4375,0,0-2.7812zm11.25,0,7.4375,0,0,2.7812-7.4375,0,0-2.7812zm-37.375,15.906,4.5625,0,0,2.3125-4.5625,0,0-2.3125zm9.875,0,4.5625,0,0,2.3125-4.5625,0,0-2.3125zm7.5625,0,6.25,0,0,4.125-6.25,0,0-4.125zm29.812,0,9.4062,0,0,4.125-9.4062,0,0-4.125zm-29.812,8.625,6.25,0,0,21.281-6.25,0,0-21.281zm29.812,0,9.4062,0,0,21.281-9.4062,0,0-21.281z"/>
    </svg>
    )
}
