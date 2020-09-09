function fn() {

    var config = {
        baseUrl : 'https://httpbin.org/'
    };

    karate.configure('connectTimeout', 5000);
    karate.configure('readTimeout', 5000);

    return config;
}