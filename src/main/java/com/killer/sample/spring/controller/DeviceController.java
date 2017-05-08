package com.killer.sample.spring.controller;

import com.killer.sample.spring.model.Device;
import com.killer.sample.spring.response.Response;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DeviceController {

    @RequestMapping(method = RequestMethod.POST, path = "/device")
    public Response registerDevice(@RequestBody Device device) {
        return new Response(200, device.toString());
    }
}
