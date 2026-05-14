package net.steveson.solidgoldstairs.datagen;

import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.client.model.generators.ItemModelProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.steveson.solidgoldstairs.SolidGoldStairsMod;

public class ModItemModelProvider extends ItemModelProvider {
    public ModItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, SolidGoldStairsMod.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {

    }
}
