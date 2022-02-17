package com.levimartines
package actions

import io.gatling.core.Predef._
import io.gatling.core.structure.ChainBuilder
import io.gatling.http.Predef._

object Task {

  private val tasks = "/tasks"

  val get: ChainBuilder = exec(
    http("Get tasks")
      .get(tasks)
      .requestTimeout(0)
  )

}
