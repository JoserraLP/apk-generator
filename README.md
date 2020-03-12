# apk-generator

This project contains a .yaml with the specification of the Android APP that will be generated automatically with the tool:

https://openapi-generator-spilab.herokuapp.com/swagger-ui.html#/servers/generateServerForLanguage

## Usage
1. Upload the .yaml file with the specification to GitHub 
2. Open the link below 
3. Select "Try it out" on "POST /api/gen/server/{framework}"
4. In label framework, specify "android-server"
5. Copy and paste the next code

```json
{
  "openAPIUrl": "link to raw .yaml file",
  "options": {
    "library": "mqtt"
  }
}
```
                
