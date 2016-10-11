package es.upm.miw.apiArchitectureTheme;

import es.upm.miw.apiArchitectureTheme.daos.DaoFactory;
import es.upm.miw.apiArchitectureTheme.daos.memory.DaoFactoryMemory;
import es.upm.miw.web.http.HttpMethod;
import es.upm.miw.web.http.HttpRequest;
import es.upm.miw.web.http.HttpResponse;
import upm.jbb.IO;

public class ApiArchitectureMain {

	private Server server = new Server();

	private HttpRequest request = new HttpRequest();

	public void help() {
		IO.getIO().println("GET **/users");
		IO.getIO().println("GET **/users/search?sport=*");
		IO.getIO().println("POST **/users body=nick:email");
		IO.getIO().println("POST **/sports body=name");
		IO.getIO().println("PUT **/users/{nick}/sport body=portName");
	}

	public void demo() {
		// POST / users body=uno:uno@gmail.com
		request.setMethod(HttpMethod.POST);
		request.setPath("users");
		request.setBody("uno:uno@gmail.com");
		this.request();
		// POST / users body=dos:dos@gmail.com
		request.setBody("dos:dos@gmail.com");
		this.request();
		// POST / users body=uno:tres@gmail.com
		request.setBody("uno:tres@gmail.com");
		this.request();
		
		// GET / users
		request.setMethod(HttpMethod.GET);
		request.setPath("users");
		request.clearQueryParams();
		this.request();
		
		// POST / sports body=tenis
		request.setMethod(HttpMethod.POST);
		request.setPath("sports");
		request.setBody("tenis");
		this.request();
		// POST / sports body=tenis
		request.setBody("tenis");
		this.request();
		// POST / sports body=ajedrez
		request.setBody("ajedrez");
		this.request();

		// PUT / users/uno/sport body=tenis
		request.setMethod(HttpMethod.PUT);
		request.setPath("users/uno/sport");
		request.setBody("tenis");
		this.request();
		// PUT / users/uno/sport body=noDeporte
		request.setBody("noDeporte");
		this.request();
		// PUT / users/dos/sport body=tenis		
		request.setPath("users/dos/sport");
		request.setBody("tenis");
		this.request();
		// PUT / users/dos/sport body=ajedrez
		request.setBody("ajedrez");
		this.request();

		// GET / users/search?sport=tenis
		request.setMethod(HttpMethod.GET);
		request.setPath("users/search");
		request.clearQueryParams();
		request.addQueryParam("sport", "tenis");
		this.request();

		// POST / noPath
		request.setMethod(HttpMethod.POST);
		request.setPath("noPath");
		request.clearQueryParams();
		this.request();
	}

	public void httpMethod() {
		request.setMethod((HttpMethod) IO.getIO().select(HttpMethod.values(), "Choose method"));
		this.showStatus();
	}

	public void path() {
		request.setPath(IO.getIO().readString("Input path"));
		this.showStatus();
	}

	public void addQueryParam() {
		String[] msgs = { "Nombre", "Valor" };
		String[] campos = { "String", "String" };
		Object[] values = IO.getIO().readForm(campos, msgs);
		request.addQueryParam((String) values[0], (String) values[1]);
		this.showStatus();
	}

	public void clearQueryParams() {
		request.clearQueryParams();
		this.showStatus();
	}

	private void showStatus() {
		IO.getIO().setStatusBar(request.toString());
	}

	public void request() {
		IO.getIO().println(request.toString());
		HttpResponse response = server.request(request);
		IO.getIO().println(response);
		IO.getIO().println("---------------------------------------ooo----------------------------------------\n");
	}

	public static void main(String[] args) {
		ApiArchitectureMain main = new ApiArchitectureMain();
		IO.getIO().addView(main);
		main.showStatus();
		DaoFactory.setFactory(new DaoFactoryMemory());
	}
}
