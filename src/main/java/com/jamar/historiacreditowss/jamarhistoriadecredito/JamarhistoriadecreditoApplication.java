package com.jamar.historiacreditowss.jamarhistoriadecredito;

import com.jamar.hc.ServiceHistorialController;
import com.jamar.historiacreditowss.jamarhistoriadecredito.business.HistoriaCreditoJPA;
import com.jamar.historiacreditowss.jamarhistoriadecredito.business.HistoriaCreditoService;
import com.jamar.historiacreditowss.jamarhistoriadecredito.config.JpaConfig;
import com.jamar.historiacreditowss.jamarhistoriadecredito.repository.DatAuditoriaRepository;
import com.jamar.historiacreditowss.jamarhistoriadecredito.repository.DatInformeRepository;
import com.jamar.historiacreditowss.jamarhistoriadecredito.repository.DatPreselectaRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Import;
import org.springframework.web.servlet.HandlerAdapter;
import org.springframework.web.servlet.HandlerMapping;
import org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerAdapter;
import org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerMapping;

@SpringBootApplication
@Import({
    HistoriaCreditoService.class,
    HistoriaCreditoJPA.class,
    ServiceHistorialController.class,
    JpaConfig.class
})
public class JamarhistoriadecreditoApplication extends SpringBootServletInitializer {


    /*
	 * Create required HandlerMapping, to avoid several default HandlerMapping instances being created
     */
    @Bean
    public HandlerMapping handlerMapping() {
        return new RequestMappingHandlerMapping();
    }

    /*
	 * Create required HandlerAdapter, to avoid several default HandlerAdapter instances being created
     */
    @Bean
    public HandlerAdapter handlerAdapter() {
        return new RequestMappingHandlerAdapter();
    }

    public static void main(String[] args) {
        SpringApplication.run(JamarhistoriadecreditoApplication.class, args);
    }

}
