package com.lset.atom;

import com.lset.atom.common.ModItemGroups;
import com.lset.atom.common.blocks.ModBlocks;
import com.lset.atom.common.command.ModCommands;
import com.lset.atom.common.items.ModItems;
import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.command.v2.CommandRegistrationCallback;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Atom implements ModInitializer {
	public static final String MOD_ID = "atom";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		//Регистрация предметов и вкладок
		ModItemGroups.registerItemGroups();
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();

		//Регистрация комманд
		CommandRegistrationCallback.EVENT.register(((dispatcher, registryAccess, environment) -> {
			ModCommands.register(dispatcher);
		}));

	}
}