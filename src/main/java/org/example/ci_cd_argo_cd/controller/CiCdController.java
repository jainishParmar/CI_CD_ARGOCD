package org.example.ci_cd_argo_cd.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("ci-cd/")
public class CiCdController {
    @GetMapping
    public ResponseEntity<String> helloController(){
        return ResponseEntity.ok("Auto sync working");
    }

    @GetMapping("notification")
    public ResponseEntity<String> NotificationController(){
        return ResponseEntity.ok("ArgoCd Notification Working");
    }

      @GetMapping("auto")
    public ResponseEntity<String> autoSyncController(){
        return ResponseEntity.ok("ArgoCd autosync Working");
    }

       @GetMapping("imageUpdater")
    public ResponseEntity<String> autoImageController(){
        return ResponseEntity.ok("Finally ArgoCd imageUpdater Working");
    }

      @GetMapping("oneCommitBehind")
    public ResponseEntity<String> oneCommitBehindController(){
        return ResponseEntity.ok("One Commit Behind");
    }

        @GetMapping("finalCheck")
    public ResponseEntity<String> finalCheckController(){
        return ResponseEntity.ok("Everything Working Properly");
    }

         @GetMapping("webhooktest")
    public ResponseEntity<String> webhookTestController(){
        return ResponseEntity.ok("webHook Working Properly");
    }


    
    


    

           @GetMapping("infiniteLoop")
    public ResponseEntity<String> infiniteLoopController(){
        return ResponseEntity.ok("ArgoCd infiniteLoop issue finally resolved");
    }

         @GetMapping("argo-noti")
    public ResponseEntity<String> argoNotiController(){
        return ResponseEntity.ok("ArgoCd email notification Working");
    }
}
