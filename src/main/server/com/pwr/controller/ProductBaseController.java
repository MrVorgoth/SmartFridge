package com.pwr.controller;

import com.pwr.mappers.ProductBaseMapper;
import com.pwr.model.ProductBaseTO;
import com.pwr.service.IProductBaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by lodwr on 06.05.2017.
 */
@CrossOrigin(origins = "*")
@RestController
@RequestMapping(path = "productBase")
public class ProductBaseController {

  @Autowired
  private IProductBaseService productBaseService;

  @RequestMapping(path = "all", method = RequestMethod.GET)
  @ResponseBody
  public List<ProductBaseTO> findAllPatients() {
    return productBaseService.findAllProducts();
  }

  @RequestMapping(path = "create", method = RequestMethod.GET)
  @ResponseBody
    public String createProduct(
      @RequestParam("name") String name,
      @RequestParam("validityPeriod") int period,
      @RequestParam("unit") String unit
    ) {
    productBaseService.createProduct(name, unit, period);
    return "ok";
  }

  @RequestMapping(method = RequestMethod.POST, consumes = "application/json")
  @ResponseBody
  public ProductBaseTO createProduct(@RequestBody ProductBaseTO product) {
    return ProductBaseMapper.mapProductBase(productBaseService.createProduct(product));
  }

  @RequestMapping(method = RequestMethod.PUT, consumes = "application/json")
  @ResponseBody
  public ProductBaseTO updateProduct(@RequestBody ProductBaseTO product) {
    return productBaseService.updateProduct(product);
  }

  @RequestMapping(method = RequestMethod.DELETE)
  @ResponseBody
  public void deleteProduct(@RequestParam("id") long id) {
    productBaseService.deleteProduct(id);
  }

  @RequestMapping(path = "search", method = RequestMethod.GET)
  public List<ProductBaseTO> test(@RequestParam("name") String name) {
    return productBaseService.findByName(name);
  }
}
