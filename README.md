Manage the music volume to your app. Create a slider bar or control buttons. Cordova / PhoneGap plugin.

Installation:

Install using Cordova CLI: cordova plugin add git+https://github.com/manusimpson/Phonegap-Android-VolumeControl.git
Example of usage (Don't forget include the rest of necessary .js libs such as cordova,jquery and css, etc):

<!DOCTYPE html>
<html>
  <head>
    <script type="text/javascript" charset="utf-8" src="cordova-X.X.X.js"></script>
    <script type="text/javascript" charset="utf-8" src="jquery.js"></script>
    <script type="text/javascript" charset="utf-8" src="VolumeControl.js"></script>
    <script type="text/javascript" charset="utf-8">
      //Set volume to 95 when click button
      $('#volUp').bind('click',function(){
         VolumeControl.setVolume(95, onVolSuccess, onVolError);
      });
      //Set volume to 25 when click button
      $('#volDown').bind('click',function(){
          VolumeControl.setVolume(25, onVolSuccess, onVolError);
      });
      //Get current volume
      $('#currVol').bind('click',function(){
          VolumeControl.getVolume(getVolSuccess, getVolError);
      });
      //Callbacks
      function onVolSuccess(){
          console.log("Volume changed");
      }
      function onVolError(){
          //Manage Error
      }
      function getVolSuccess(r){
          alert(r);
      }
      function getVolError(){
          //Manage Error
      }
    </script>
  </head>
  <body>
    <input type="button" id="volUp" value="Volume up"/>
    <input type="button" id="volDown" value="Volume down"/>

    <input type="button" id="currVol" value="Get current Volume"/>
  </body>
</html>
