package com.example.hibernatedemo.resource;

import jakarta.ws.rs.core.MediaType;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.hibernatedemo.dao.HostellerDao;
import com.example.hibernatedemo.model.Hosteller;

import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.DELETE;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;

@Path("/hostellers")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class HostelResource {
	@Autowired
	private HostellerDao hostellerDao;
	
	@GET
    public List<Hosteller> getAll() {
        return hostellerDao.findAll();
    }

    @GET
    @Path("/{id}")
    public Optional<Hosteller> findById(@PathVariable int id) {
        return hostellerDao.findById(id);
    }

    @POST
    public void save(@RequestBody Hosteller hosteller) {
        hostellerDao.save(hosteller);
    }

    @DELETE
    public void delete(@PathVariable int id) {
        hostellerDao.deleteById(id);;
    }
}
