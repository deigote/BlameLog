package com.deigote.blame.services

import com.deigote.blame.model.ActionLogEntry
import org.springframework.http.ResponseEntity
import org.springframework.stereotype.Service

import static org.springframework.http.HttpStatus.OK
import static org.springframework.web.bind.annotation.RequestMethod.POST

@Service
class LogEntryPersistenceService {

   ActionLogEntry create(ActionLogEntry actionLogEntry) {
      actionLogEntry
   }
}
