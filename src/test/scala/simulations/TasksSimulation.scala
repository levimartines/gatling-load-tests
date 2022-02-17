package com.levimartines
package simulations

import actions.Task
import configuration.AppConfiguration
import io.gatling.core.Predef._
import io.gatling.core.structure.ScenarioBuilder

class TasksSimulation extends Simulation {

  val scenarioBuilder: ScenarioBuilder = scenario("Get tasks")
    .exec(Task.get)

  setUp(scenarioBuilder.inject(constantUsersPerSec(200) during 30))
    .protocols(AppConfiguration.httpProtocol)
    .assertions(global.successfulRequests.percent.gt(99))
}
