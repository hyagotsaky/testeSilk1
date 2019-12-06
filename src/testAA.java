import com.borland.silktest.jtf.BrowserBaseState;
import org.junit.Before;
import org.junit.Test;
import com.borland.silktest.jtf.xbrowser.DomElement;
import org.junit.Assert;
import com.borland.silktest.jtf.Desktop;

public class testAA {

	private Desktop desktop = new Desktop();

	@Before
	public void baseState() {
		// Go to web page 'https://g1.globo.com/'
		BrowserBaseState baseState = new BrowserBaseState();
		baseState.execute(desktop);
	}

	@Test
	public void test() {
		desktop.<DomElement>find("g1_globo_com.BrowserWindow.post-previsao-do-tem").click();
		desktop.<DomElement>find("g1_globo_com.BrowserWindow.28º").click();
		DomElement _28º = desktop.<DomElement>find("g1_globo_com.BrowserWindow.28º");
		Assert.assertEquals("28º", _28º.getText());
	}

}