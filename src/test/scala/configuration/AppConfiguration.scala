package com.levimartines
package configuration

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.http.protocol.HttpProtocolBuilder

object AppConfiguration {
  val httpProtocol: HttpProtocolBuilder = http
    .baseUrl("http://localhost:8080")
}
