package velizarbg.nbtlimitmodifier;

import me.shedaniel.autoconfig.AutoConfig;
import me.shedaniel.autoconfig.ConfigData;
import me.shedaniel.autoconfig.annotation.Config;
import me.shedaniel.autoconfig.serializer.JanksonConfigSerializer;
import me.shedaniel.cloth.clothconfig.shadowed.blue.endless.jankson.Comment;

@Config(name = "nbtlimitmodifier")
public class ModConfig implements ConfigData {
	public static ModConfig init() {
		AutoConfig.register(ModConfig.class, JanksonConfigSerializer::new);
		return AutoConfig.getConfigHolder(ModConfig.class).getConfig();
	}

	@Comment("Controls the maximum permitted size of an nbt tag in bytes")
	public long nbtTagMaxBytes = 2097152L;
}
