# JavaViCare
This is a Java Tool to connect to the Viessmann Vicare Service.

## Project status
The following devices are implemented:
- General Service to generate an OAuth-Token and access the API
- GasBoiler Device

## Usage
Add your username and password from your Viessmann-App to the configuration file and start exploring the values of your heating.

## Viessmann API limits

Recently Viessmann has introduced a rate limit on their REST API. If you exceed one of the limits below you will be banned for 24 hours:

    Limit 1: 120 calls for a time window of 10 minutes
    Limit 2: 1450 calls for a time window of 24 hours

Source: https://www.home-assistant.io/integrations/vicare/

## Credit
Thanks for the helpful information found in the Project PyViCare.
<br/>
Check out Simon Gillet's Python based approach: 
https://github.com/somm15/PyViCare

Feel free to donate if you like to support my work (there is a lot of coffee involved):
<br/>

<a href="https://www.paypal.com/donate?hosted_button_id=D5X9M3BXZ3Z4A">
  <img src="https://raw.githubusercontent.com/stefan-niedermann/paypal-donate-button/master/paypal-donate-button.png" alt="Donate with PayPal" width="20%" />
</a>
