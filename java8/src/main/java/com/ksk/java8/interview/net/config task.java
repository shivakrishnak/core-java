@Configuration
@Slf4j
@Profile("dev")
public class RestTemplateConfig {
	
    @Bean
    public RestTemplate defaultRestTemplate(@Autowired(required = false) @Qualifier("defaultRestLoggingInterceptor") 
	                                         RestTemplateLoggingRequestInterceptor defaultRestLoggingInterceptor,
                                         @Autowired(required = false) @Qualifier("kafkaRestLoggingInterceptor")
										 RestTemplateLoggingRequestInterceptor kafkaRestLoggingInterceptor,
                                         @Qualifier("clientCredentials") ClientCredentialsResourceDetails clientCredentialsResourceDetails) {
        RestTemplate template = new RestTemplate();

        List<ClientHttpRequestInterceptor> interceptors = new ArrayList<>(template.getInterceptors());
        if (defaultRestLoggingInterceptor != null)
            interceptors.add(defaultRestLoggingInterceptor);
        if (kafkaRestLoggingInterceptor != null)
            interceptors.add(kafkaRestLoggingInterceptor);
        template.setInterceptors(interceptors);
        return template;
    }


}