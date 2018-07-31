```
------------- request ---------------
"Body : (empty)"
"Headers : (1)"
Accept-Encoding : compress;q=0.5, gzip;q=1.0

--------------- response -----------------
<-- 200 (http://httpbin.org/get)
Response : OK
Length : 383
Body : ({
  "args": {},
  "headers": {
    "Accept": "text/html, image/gif, image/jpeg, *; q=.2, */*; q=.2",
    "Accept-Enooding": "compress;q=0.5, gzip;q=1.0",
    "Cache-Control": "no-cache",
    "Connection": "close",
    "Host": "httpbin.org",
    "Pragma": "no-cache",
    "User-Agent": "Java/1.8.0_162"
  },
  "origin": "219.144.248.241",
  "url": "http://httpbin.org/get"
}
)
Headers : (8)
Server : [gunicorn/19.9.0]
Access-Control-Allow-Origin : [*]
Access-Control-Allow-Credentials : [true]
Connection : [keep-alive]
Content-Length : [383]
Date : [Tue, 31 Jul 2018 12:16:07 GMT]
Via : [1.1 vegur]
Content-Type : [application/json]

--------------- third ------------------
[Success: {
  "args": {},
  "headers": {
    "Accept": "text/html, image/gif, image/jpeg, *; q=.2, */*; q=.2",
    "Accept-Enooding": "compress;q=0.5, gzip;q=1.0",
    "Cache-Control": "no-cache",
    "Connection": "close",
    "Host": "httpbin.org",
    "Pragma": "no-cache",
    "User-Agent": "Java/1.8.0_162"
  },
  "origin": "219.144.248.241",
  "url": "http://httpbin.org/get"
}
]
```