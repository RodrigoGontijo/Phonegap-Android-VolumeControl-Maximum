/*
 * Phonegap VolumeMax Plugin for Android
 * Cordova 2.2.0
 * Email: rodrigo[dot]gontijo[at]hotmail[dot]com
 * Author: Rodrigo Augusto Gontijo
 * Date: 05/23/2016
 */

var exec = require('cordova/exec');

var VolumeMax = {
  setVolumeMax: function(successCallback, failureCallback){
		return exec(
			successCallback,
			failureCallback,
			'VolumeMax',
			'setVolumeMax',
			[]);
	}
};

module.exports = VolumeMax;