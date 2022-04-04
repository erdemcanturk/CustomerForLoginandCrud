

## Endpoints

#### List Users

GET localhost:5858/api/v1/customers
````
GET /api/v1/customers HTTP/1.1
Host: localhost:5858
Authorization: Basic c2VjdXJlS2V5VXNlcm5hbWUhOnNlY3VyZUtleVBhc3N3b3JkIQ==
Cookie: JSESSIONID=B5B9AD173522F7CF449BD530066807C5
````

### Get User By id

GET localhost:5858/api/v1/customers/{id}
```/api/v1/customers/4```



###Delete user by id

 DELETE localhost:5858/api/v1/customers/{id}

```/api/v1/customers/2```



###Create a Customer

POST localhost:5858/api/v1/customers

```aidl
POST /api/v1/customers HTTP/1.1
Host: localhost:5858
Authorization: Basic c2VjdXJlS2V5VXNlcm5hbWUhOnNlY3VyZUtleVBhc3N3b3JkIQ==
Content-Type: application/json
Cookie: JSESSIONID=8B449557FD997BB9D684A671D5A61AED
Content-Length: 162

{
    "firstName": "Ricardo",
    "lastName": "Quaresma",
    "custMail": "Ricardo@Q7.com",
    "street": "Besiktas",
    "phoneNum":"+90 555 1903 93"


}
```

### Update Customer

PUT localhost:5858/api/v1/customers/{id}

```aidl
PUT /api/v1/customers/4 HTTP/1.1
Host: localhost:5858
Authorization: Basic c2VjdXJlS2V5VXNlcm5hbWUhOnNlY3VyZUtleVBhc3N3b3JkIQ==
Content-Type: application/json
Cookie: JSESSIONID=B48E7FC82F111A90A28150593C8FFF19
Content-Length: 152

{
    "firstName": "Gary",
    "lastName": "Medel",
    "custMail": "Ricardo@Q7.com",
    "street": "Besiktas",
    "phoneNum":"+90 555 1903 93"
}
```
