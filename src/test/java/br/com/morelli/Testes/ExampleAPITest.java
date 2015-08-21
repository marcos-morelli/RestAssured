package br.com.morelli.Testes;

import static com.jayway.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;
import static com.jayway.restassured.module.jsv.JsonSchemaValidator.*;
import org.junit.Test;

public class ExampleAPITest {
	
	public ExampleAPITest() {
		baseURI = "http://localhost/example-api";
		port = 80;
		authentication = basic("morelli", "morelli");
	}

	@Test
	public void validarDadosExample() {
		given()
			.param("nome", "Morelli")
		.when()
			.get("/")
		.then()
			.log()
				.all();
	}

}
