package org.vertx.scala

import org.vertx.java.core.Handler

/**
 * This trait shows that this type is a wrapper around a Vert.x Java class.
 *
 * @author <a href="http://www.campudus.com/">Joern Bernhardt</a>
 */
trait VertxWrapper[ST, JT] extends Wrap { this: ST =>

  protected[this] val internal: JT

}