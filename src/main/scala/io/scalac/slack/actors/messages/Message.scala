package io.scalac.slack.actors.messages

import io.scalac.slack.api.APIKey

/**
 * Created on 20.01.15 23:59
 */
sealed trait Message

object Start extends Message

//starts the system
object Stop extends Message


case class ApiTest(param: Option[String] = None, error: Option[String] = None) extends Message

case class Ok(args: Map[String, String]) extends Message

case class AuthTest(token: APIKey) extends Message