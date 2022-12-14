package me.dio.potenciatech.resources;

import io.swagger.annotations.Api;
import lombok.RequiredArgsConstructor;
import me.dio.potenciatech.service.impl.RestauranteServiceImpl;
import org.springframework.web.bind.annotation.*;
import me.dio.potenciatech.entities.Restaurante;
import me.dio.potenciatech.resources.dto.RestauranteDto;

import java.util.List;


@Api(value = "/api/v1/restaurantes", tags = {"Serviço para cadastro de restaurantes"})
@RestController
@RequestMapping("/api/v1/restaurantes")
@RequiredArgsConstructor
public class RestauranteResource {
  private final RestauranteServiceImpl restauranteService;

  @PostMapping
  public Restaurante incluir(@RequestBody RestauranteDto form) {
    return restauranteService.incluir(form);
  }

  @GetMapping
  public List<Restaurante> buscarTodos() {
    return restauranteService.buscarTodos();
  }

  @GetMapping("/{id}")
  public Restaurante buscarPorId(@PathVariable("id") Long id) {
    return restauranteService.buscarPorId(id);
  }

  @PutMapping("/atualizar/{id}")
  public Restaurante atualizar(@PathVariable("id") Long id, @RequestBody RestauranteDto form) {
    return restauranteService.atualizar(id, form);
  }

  @DeleteMapping("/deletar/{id}")
  public void deletar(@PathVariable("id") Long id) {
    restauranteService.deletar(id);
  }
}
