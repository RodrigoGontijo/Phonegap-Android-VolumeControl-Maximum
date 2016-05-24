Phonegap-Android-VolumeControl-Maximum
==============================

Put all volumes from your app to max.  Create a slider bar or control buttons.  Cordova / PhoneGap plugin.

Installation:
-------------
1. Install using Cordova CLI:
    `cordova plugin add https://github.com/RodrigoGontijo/Phonegap-Android-VolumeControl-Maximum.git`

__Example of usage ()__

  	<!DOCTYPE html>
    <html>
      <head>
        <script type="text/javascript" charset="utf-8" src="cordova-X.X.X.js"></script>
        <script type="text/javascript" charset="utf-8" src="jquery.js"></script>
        <script type="text/javascript" charset="utf-8" src="VolumeControl.js"></script>
        <script type="text/javascript" charset="utf-8">
         
          //Set volume to max when click button
          $('#volDown').bind('click',function(){
              VolumeControl.setVolume(onVolSuccess, onVolError);
          });
         
          //Callbacks
          function onVolSuccess(){
              console.log("Volume changed to max");
          }
          function onVolError(){
              //Manage Error
          }
         
        </script>
      </head>
      <body>
        <input type="button" id="volMax" value="Volume Max"/>
      </body>
    </html>
