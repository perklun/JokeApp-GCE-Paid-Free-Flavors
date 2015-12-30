# Joke App
Description
-------
Android App that displays a joke retrieved from a Google Cloud Endpoint when the button is clicked. The app comes in both paid and free flavors. The app also has a connected test to check that the joke is retrieved by an AsyncTask

Techical Details
--------
- Used a Java library for supplying jokes
- Implemented an Android library with an activity that displays jokes passed to it as intent extras.
- A Google Cloud Endpoints module  supplies jokes from the Java library. App loads jokes from GCE module via an async task.
- Connected tests verify that the async task is indeed loading jokes.
- Contains paid/free flavors. The paid flavor has no ads, and no unnecessary dependencies.
