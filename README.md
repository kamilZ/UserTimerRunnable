UserTimerRunnable
=================
----

UserTimerRunnable class. Implementation of inactivity timer with handler. 


How TO
--------------

----
Use it on your Application Controller. Add the class UserTimerRunnable, use this code where you want and we are ready :)

----

```java
    Handler handler = new Handler();
    UserTimerRunnable userTimer = new UserTimerRunnable(30 * 60 * 1000, handler); // 30m
    handler.postDelayed(userTimer, 1000);
```
 


License
----

MIT


**Free Software, Hell Yeah!**

Kamil Zabdyr
    
