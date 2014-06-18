package com.deigote.blame.model

import groovy.transform.ToString
import org.springframework.format.annotation.DateTimeFormat

import java.time.ZonedDateTime

/**
 * Created by deigote on 08/06/14.
 */

@ToString(includeNames = true, includePackage = false)
class ActionLogEntry {

   String applicationName
   String actionName
   String userName
   Map<String, String> actionParameters

   @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
   ZonedDateTime timeStamp //= new ZonedDateTime()

}
