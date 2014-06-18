package com.deigote.blame.controllers

import com.deigote.blame.model.ActionLogEntry
import com.deigote.blame.services.LogEntryPersistenceService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.ResponseEntity
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod
import org.springframework.web.bind.annotation.ResponseBody

import static org.springframework.http.HttpStatus.OK
import static org.springframework.web.bind.annotation.RequestMethod.POST

@Controller
class LogEntryController {

   @Autowired LogEntryPersistenceService logEntryPersistenceService

   @RequestMapping(value = '/requestLog/add', method = POST)
   @ResponseBody ResponseEntity<String> add(@RequestBody ActionLogEntry logEntry) {
      ActionLogEntry persistedLogEntry = logEntryPersistenceService.create(logEntry)
      new ResponseEntity<String>(persistedLogEntry.toString(), OK)
   }
}
