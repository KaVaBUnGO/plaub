package com.plaub.web.controllers;

import org.slf4j.*;
import org.springframework.stereotype.*;
import org.springframework.ui.*;
import org.springframework.web.bind.annotation.*;

/**
 * Created by Chernov Artur on 03.08.2016.
 */
@Controller
public class IndexController {
  private static final   Logger LOGGER    = LoggerFactory.getLogger( IndexController.class );
  protected static final String PATH_ROOT = "/";
  @RequestMapping( PATH_ROOT )
  public String getHomePage( Model model ) {
    LOGGER.debug( "Getting home page" );
    return "index";
  }
}
