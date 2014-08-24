//
// =========================================================================
//  Rain - A Project Copyright (C) 2012 - 2014 by Yan Chernikov, and      
//  TheCherno.com. Distribution of these Java source files "as is" is
//  prohibited, subject to law. Compiled versions and modified  source code
//  may be distributed, provided all comments are removed and fair use is
// justified. Full license can be found at http://code.thecherno.com/terms.
// =========================================================================

// =========================================================================
//  This source file refers to Episode 100 of Game Programming, which can be
//  found at http://youtu.be/1OpLi7wWvyY
// =========================================================================
//

// The package (or folder hierarchy) of where this class is located in our structure.
package com.thecherno.rain.level.tile;

// Import all required classes for this class.
import com.thecherno.rain.graphics.Screen;
import com.thecherno.rain.graphics.Sprite;
import com.thecherno.rain.level.tile.spawn_level.SpawnFloorTile;
import com.thecherno.rain.level.tile.spawn_level.SpawnGrassTile;
import com.thecherno.rain.level.tile.spawn_level.SpawnHedgeTile;
import com.thecherno.rain.level.tile.spawn_level.SpawnWallTile;
import com.thecherno.rain.level.tile.spawn_level.SpawnWaterTile;

// The Tile class. This class represents a tile in our level. This class is meant
// to be used as a "template" for different types of tiles, by creating subclasses
// of this class.
public class Tile {
	
	// The x and y location of the tile.
	public int x, y;
	// The sprite which represents this tile graphically.
	public Sprite sprite;
	// The grass tile.
	public static Tile grass = new GrassTile(Sprite.grass);
	// The flower tile.
	public static Tile flower = new FlowerTile(Sprite.flower);
	// The rock tile.
	public static Tile rock = new RockTile(Sprite.rock);
	// The void tile.
	public static Tile voidTile = new VoidTile(Sprite.voidSprite);

	// All of our Spawn Level tiles are defined here, created from their relevant
	// sprites.
	public static Tile spawn_grass = new SpawnGrassTile(Sprite.spawn_grass);
	public static Tile spawn_hedge = new SpawnHedgeTile(Sprite.spawn_hedge);
	public static Tile spawn_water = new SpawnWaterTile(Sprite.spawn_water);
	public static Tile spawn_wall1 = new SpawnWallTile(Sprite.spawn_wall1);
	public static Tile spawn_wall2 = new SpawnWallTile(Sprite.spawn_wall2);
	public static Tile spawn_floor = new SpawnFloorTile(Sprite.spawn_floor);

	// Colours are defined for every spawn level tile. These colours refer to
	// the colour of the pixels in the level file which determine which tile
	// should get rendered where. These variables are used in the Level class.
	public static final int col_spawn_grass = 0xff00ff00;
	public static final int col_spawn_hedge = 0; // unused
	public static final int col_spawn_water = 0xff0026FF; // unused
	public static final int col_spawn_wall1 = 0xff808080;
	public static final int col_spawn_wall2 = 0xff303030;
	public static final int col_spawn_floor = 0xff724715;

	// A constructor. Creates a new tile with the given sprite.
	public Tile(Sprite sprite) {
		this.sprite = sprite;
	}

	// Renders the tile; currently empty. This will later be overidden.
	public void render(int x, int y, Screen screen) {
	}

	// Returns whether the tile is solid or not; whether the player (or other mob)
	// can pass through it or not. This will later be used with collision detection,
	// and is meant to be overidden in subclasses where required.
	public boolean solid() {
		return false;
	}

}
