/*******************************************************************************
 * Copyright 2011 See AUTHORS file.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *   http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 ******************************************************************************/

package com.badlogic.gdx.physics.box2d;

import com.badlogic.gdx.math.Vector2;

/** A circle shape.
 * @author mzechner */
public class CircleShape extends Shape {
	org.jbox2d.collision.shapes.CircleShape shape;
	
	public CircleShape () {
		shape = new org.jbox2d.collision.shapes.CircleShape();
	}
	
	CircleShape(org.jbox2d.collision.shapes.CircleShape shape) {
		this.shape = shape;
	}

	/** {@inheritDoc} */
	@Override
	public Type getType () {
		return Type.Circle;
	}

	/** Returns the position of the shape */
	private final Vector2 position = new Vector2();

	public Vector2 getPosition () {
		return position.set(shape.m_p.x, shape.m_p.y);
	}

	/** Sets the position of the shape */
	public void setPosition (Vector2 position) {
		shape.m_p.set(position.x, position.y);
	}

	@Override
	public float getRadius () {
		return shape.getRadius();
	}

	@Override
	public void setRadius (float radius) {
		shape.setRadius(radius);
	}

	@Override
	public int getChildCount () {
		return shape.getChildCount();
	}
}