package net.lotrcraft.scbuildings;

import net.lotrcraft.strategycraft.buildings.Building;
import net.lotrcraft.strategycraft.buildings.Schematic;

import org.bukkit.Chunk;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.World;
import org.bukkit.block.Block;

public class Citadel extends Building {
	Schematic schematic = new Schematic(null);
	Material material = Material.STONE;
	Chunk chunk;
	World world;
	Location l;
	Block block;
	int x, y, z;

	@Override
	public void build(Location l) {
		this.l = l;
		block = l.getBlock();
		x = block.getX();
		y = block.getY();
		z = block.getZ();
		world = l.getWorld();
		world.loadChunk(l.getBlock().getChunk());
		world.getBlockAt(x + 2, y, z).setType(this.material);
		world.getBlockAt(x + 2, y, z + 1).setType(this.material);
		world.getBlockAt(x + 2, y, z + 2).setType(this.material);
		world.getBlockAt(x + 1, y, z + 2).setType(this.material);
		world.getBlockAt(x, y, z + 2).setType(this.material);
		world.getBlockAt(x - 1, y, z + 2).setType(this.material);
		world.getBlockAt(x - 2, y, z + 2).setType(this.material);
		world.getBlockAt(x - 2, y, z + 1).setType(this.material);
		world.getBlockAt(x - 2, y, z).setType(this.material);
		world.getBlockAt(x + 2, y, z - 1).setType(this.material);
		world.getBlockAt(x + 2, y, z - 2).setType(this.material);
		world.getBlockAt(x + 1, y, z - 2).setType(this.material);
		world.getBlockAt(x, y, z - 2).setType(this.material);
		world.getBlockAt(x - 1, y, z - 2).setType(this.material);
		world.getBlockAt(x - 2, y, z - 2).setType(this.material);
		world.getBlockAt(x - 2, y, z - 1).setType(this.material);
	}

	@Override
	public void destroy() {
		block = l.getBlock();
		x = block.getX();
		y = block.getY();
		z = block.getZ();
		world = l.getWorld();
		world.loadChunk(l.getBlock().getChunk());
		world.getBlockAt(x + 2, y, z).setType(Material.AIR);
		world.getBlockAt(x + 2, y, z + 1).setType(Material.AIR);
		world.getBlockAt(x + 2, y, z + 2).setType(Material.AIR);
		world.getBlockAt(x + 1, y, z + 2).setType(Material.AIR);
		world.getBlockAt(x, y, z + 2).setType(Material.AIR);
		world.getBlockAt(x - 1, y, z + 2).setType(Material.AIR);
		world.getBlockAt(x - 2, y, z + 2).setType(Material.AIR);
		world.getBlockAt(x - 2, y, z + 1).setType(Material.AIR);
		world.getBlockAt(x - 2, y, z).setType(Material.AIR);
		world.getBlockAt(x + 2, y, z - 1).setType(Material.AIR);
		world.getBlockAt(x + 2, y, z - 2).setType(Material.AIR);
		world.getBlockAt(x + 1, y, z - 2).setType(Material.AIR);
		world.getBlockAt(x, y, z - 2).setType(Material.AIR);
		world.getBlockAt(x - 1, y, z - 2).setType(Material.AIR);
		world.getBlockAt(x - 2, y, z - 2).setType(Material.AIR);
		world.getBlockAt(x - 2, y, z - 1).setType(Material.AIR);
	}
}