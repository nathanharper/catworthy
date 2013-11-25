package controllers

import play.api._
import play.api.mvc._
import anorm._
import anorm.SqlParser._
import play.api.db.DB
import play.api.Play.current
import models.Cat

object Application extends Controller {
  
  def index = Action {
    Ok(views.html.index("Squirrel Butts"))
  }
  
  def cats(cat:String) = Action {
    DB withConnection { implicit c =>
      SQL("SELECT * FROM `cat` WHERE `url` = {cat}")
	    .on("cat" -> cat)().headOption match {
	      case None => NotFound("No such cat.")
	      case Some(row) => Ok(views.html.cats(Cat.tupled((
		    row[Option[String]]("title") getOrElse "",
		    row[Option[String]]("subcopy") getOrElse "",
		    row[Option[String]]("body") getOrElse "",
		    row[Option[String]]("image") getOrElse "",
		    row[Option[String]]("video") getOrElse ""
	      ))))
	    } 
    }
  }

}
