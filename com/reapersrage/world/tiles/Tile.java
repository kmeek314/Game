package com.reapersrage.world.tiles;

import com.reapersrage.gfx.Screen;
import com.reapersrage.gfx.Sprite;

/**
 * Created with IntelliJ IDEA.
 * User: Soulevoker
 * Date: 10/24/13
 * Time: 6:22 PM
 * Copyright © Reapers' Rage 2013
 */
public abstract class Tile {

    public static Tile grass = new GrassTile(Sprite.grass);

    public int x, y;
    public Sprite sprite;

    public Tile(Sprite sprite) {
        this.sprite = sprite;
    }

    protected abstract void render(int x, int y, Screen screen);

    protected boolean solid() {
        return false;
    }

}