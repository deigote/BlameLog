package com.deigote.blame.model

import groovy.transform.ToString

/**
 * Created by deigote on 08/06/14.
 */

@ToString
class ModifiedInstanceLogEntry {

   String instanceIdentifier
   String actionName
   String userName
   Map<String, String> actionParameters


}
