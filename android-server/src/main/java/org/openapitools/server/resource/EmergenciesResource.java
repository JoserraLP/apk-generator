/**
 * Emergency Alerts
 * This application notifies users about an emergency within a geographical area, you can also obtain users information and its location within an area to plan possible evacuations or other uses
 *
 * OpenAPI spec version: 1.0
 * Contact: info@spilab.es
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package org.openapitools.server.resource;


import org.openapitools.server.model.*;
import org.openapitools.server.response.*;

import java.util.*;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;


import org.openapitools.server.model.Emergency;
import org.openapitools.server.model.EmergencyResponse;



import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeoutException;
import android.content.Context;
import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.Volley;
import android.util.Log;
import android.widget.Toast;


public class EmergenciesResource {

    private Context context;
    private RequestQueue request;

    private EmergenciesResponse emergenciesResponse;

    public EmergenciesResource(Context context) {
        this.context = context;
        request = Volley.newRequestQueue(context);

    }

  public void executeMethod(EmergenciesResponse response){

        emergenciesResponse=response;

      switch (response.getMethod()){
          case "postEmergency":
            postEmergency(response.getParams().getemergency());
            break;
      }


  }

  /**
  * Sends an emergency to the devices
  * An emergency is sent to the devices and return users&#39;s information inside the emergency area
   * @param emergency Information about the emergency
   * @return EmergencyResponse
  */
  public EmergencyResponse postEmergency (Emergency emergency){

    //TODO: Process the information, generate a reply, etc.

      //TODO: Put your object to return
      return null;
  }


}
