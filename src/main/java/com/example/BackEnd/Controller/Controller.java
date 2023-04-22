package com.example.BackEnd.Controller;

import com.example.BackEnd.DTO.Dto;
import com.example.BackEnd.Model.Estudio;
import com.example.BackEnd.Model.Experiencia;
import com.example.BackEnd.Model.Habilidad;
import com.example.BackEnd.Model.Proyecto;
import com.example.BackEnd.Service.*;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*")
public class Controller {
    @Autowired
    private IEstudioService estudioService;
    @Autowired
    private IExperienciaService experienciaService;
    @Autowired
    private IHabilidadService habilidadService;
    @Autowired
    private IPersonaService personaService;
    @Autowired
    private IProyectoService proyectoService;
    private String traerComoJson() throws JsonProcessingException {
        ObjectMapper maper = new ObjectMapper();
        Dto datos = new Dto();

        datos.setEstudios(estudioService.traer());
        datos.setProyectos(proyectoService.traer());
        datos.setPer(personaService.traer());
        datos.setHabilidades(habilidadService.traer());

        return maper.writeValueAsString(datos);
    }
    @GetMapping("/getDatos")
    public String getDatos()throws JsonProcessingException {
        return traerComoJson();
    }
    @PostMapping("/crear/estudio")
    public String crearEstudio(@RequestBody Estudio estudio) throws JsonProcessingException {
        estudioService.crear(estudio);
        return traerComoJson();
    }
    @PostMapping("/crear/experiencia")
    public String crearExperiencia(@RequestBody Experiencia exp) throws JsonProcessingException {
        experienciaService.crear(exp);
        return traerComoJson();
    }
    @PostMapping("/crear/habilidad")
    public String crearHabilidad(@RequestBody Habilidad hab) throws JsonProcessingException {
        habilidadService.crear(hab);
        return traerComoJson();
    }
    @PostMapping("/crear/proyecto")
    public String crearProyecto(@RequestBody Proyecto proy) throws JsonProcessingException {
        proyectoService.crear(proy);
        return traerComoJson();
    }
    @DeleteMapping("/eliminar/estudio/{id}")
    public String eliminarEstudio(@RequestParam long id) throws JsonProcessingException{
        estudioService.eliminar(id);
        return traerComoJson();
    }
    @DeleteMapping("/eliminar/experiencia/{id}")
    public String eliminarExperiencia(@RequestParam long id) throws JsonProcessingException{
        experienciaService.eliminar(id);
        return traerComoJson();
    }
    @DeleteMapping("/eliminar/habilidad/{id}")
    public String eliminarHabilidad(@RequestParam long id) throws JsonProcessingException{
        habilidadService.eliminar(id);
        return traerComoJson();
    }
    @DeleteMapping("/eliminar/proyecto/{id}")
    public String eliminarProyecto(@RequestParam long id) throws JsonProcessingException{
        proyectoService.eliminar(id);
        return traerComoJson();
    }
}
