package com.deigote.blame.model

import groovy.transform.ToString
import org.springframework.format.annotation.DateTimeFormat

import java.time.ZonedDateTime

@ToString(includeNames = true, includePackage = false)
class ActionLogEntry {

   String applicationName
   String actionName
   String userName
   Map<String, String> actionParameters

   @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
   ZonedDateTime timeStamp

}
