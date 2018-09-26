package org.mael.customer.config;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.apache.maven.model.Model;
import org.apache.maven.model.io.xpp3.MavenXpp3Reader;
import org.codehaus.plexus.util.xml.pull.XmlPullParserException;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig {

	@Bean
	public Docket docketApi() throws Exception {
		return new Docket(DocumentationType.SWAGGER_2)//
				.select()
				.apis(RequestHandlerSelectors.basePackage("org.mael.customer.adapter.portin"))//
				.build()//
				.apiInfo(metadata());
	}

	private ApiInfo metadata() throws Exception {
		ApiInfoBuilder builder= new ApiInfoBuilder()//
				.title("Customer Service Api Documentation")//
				.description("Documentation automatically generated")//
				.contact(new Contact("maël OUAHI", "", "mael.ouahi@outlook.fr"))//
				.version(getApiVersion());
		return builder.build();
	}

	private String getApiVersion() throws FileNotFoundException, IOException, XmlPullParserException {
		MavenXpp3Reader reader = new MavenXpp3Reader();
		Model model = reader.read(new FileReader("pom.xml"));
		return model.getVersion();
	}
}
