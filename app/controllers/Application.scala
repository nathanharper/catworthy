package controllers

import play.api._
import play.api.mvc._

object Application extends Controller {

  def index = Action {
    Ok(views.html.index("Squirrel Butts"))
  }
  
  def cats(cat:String) = Action {
    Ok(views.html.cats(cat))
  }

}
