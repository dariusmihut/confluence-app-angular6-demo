package ut.net.seibertmedia.confluence.demo;

import net.seibertmedia.confluence.demo.api.MyPluginComponent;
import net.seibertmedia.confluence.demo.impl.MyPluginComponentImpl;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MyComponentUnitTest {

	@Test
	public void testMyName() {
		MyPluginComponent component = new MyPluginComponentImpl(null);
		assertEquals("names do not match!", "myComponent", component.getName());
	}
}
