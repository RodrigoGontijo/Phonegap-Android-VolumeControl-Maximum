Phonegap-Android-VolumeControl-Maximum
==============================

Set all volumes from your app to max.  Cordova / PhoneGap plugin.

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
        <script type="text/javascript" charset="utf-8" src="VolumeMax.js"></script>
        <script type="text/javascript" charset="utf-8">
         
          //Set volume to max when click button
          $('#volMax').bind('click',function(){
              VolumeMax.setVolumeMax(onVolSuccess, onVolError);
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
        <input type="button" id="volMax" value="Volume max"/>
      </body>
    </html>
