# Microservices com SpringBoot, Docker, Kubernetes



### O curso aborda conceitos avançados de arquitetura de microservices e práticas modernas de desenvolvimento de software.

### Objetivos do Curso

- Compreender os fundamentos da arquitetura de microservices e suas vantagens sobre arquiteturas monolíticas e SOA.
- Implementar microservices escaláveis e resilientes utilizando Java, SpringBoot e Spring Cloud.
- Utilizar Docker para containerizar aplicações e simplificar o ambiente de desenvolvimento e implantação.
- Orquestrar microservices em clusters Kubernetes para escalar e gerenciar aplicações de forma eficiente.
- Implementar práticas de observabilidade, segurança e monitoramento em microservices usando ferramentas como Prometheus, Grafana e Helm.
- Integrar serviços e garantir a resiliência de aplicações distribuídas usando RabbitMQ, Kafka e padrões de mensageria.
- Configurar e gerenciar a infraestrutura de nuvem usando Google Cloud Platform (GCP) e Kubernetes Engine.
- Documentar APIs utilizando OpenAPI Specification e Swagger para facilitar a comunicação e colaboração entre equipes.

## Ferramentas e Tecnologias Utilizadas

- **Spring Boot**: Framework para criação de aplicações Java. [Spring Boot Website](https://spring.io/projects/spring-boot)
- **Spring Cloud**: Conjunto de ferramentas para construção de sistemas distribuídos baseados em microservices. [Spring Cloud Website](https://spring.io/projects/spring-cloud)
- **Docker**: Plataforma de containerização para criar, implantar e executar aplicações. [Docker Website](https://www.docker.com)
- **Kubernetes**: Sistema open-source para automatizar a implantação, escala e operação de aplicações em contêineres. [Kubernetes Website](https://kubernetes.io)
- **Prometheus**: Sistema de monitoramento e alerta de código aberto. [Prometheus Website](https://prometheus.io)
- **Grafana**: Plataforma para análise e monitoramento de métricas. [Grafana Website](https://grafana.com)
- **Helm**: Gerenciador de pacotes para Kubernetes. [Helm Website](https://helm.sh)
- **Google Cloud Platform (GCP)**: Plataforma de computação em nuvem oferecida pelo Google. [GCP Website](https://cloud.google.com)
- **RabbitMQ**: Plataforma de mensageria para comunicação assíncrona entre microservices. [RabbitMQ Website](https://www.rabbitmq.com)
- **Kafka**: Plataforma de streaming distribuído. [Apache Kafka Website](https://kafka.apache.org)
- **OpenAPI Specification**: Especificação para descrever APIs RESTful. [OpenAPI Website](https://www.openapis.org)
- **Swagger**: Ferramenta para documentar APIs RESTful. [Swagger Website](https://swagger.io)
- **Lucidchart**: Ferramenta de diagramação online. [Lucidchart Blog](https://www.lucidchart.com/blog/ddd-event-storming)
- **Model Mapper**: Biblioteca para mapeamento de objetos Java. [Model Mapper Website](http://modelmapper.org)
- **Map Struct**: Framework para mapeamento de objetos em tempo de compilação. [Map Struct Website](https://mapstruct.org)
- **Spring Cloud Config**: Servidor de configuração distribuída para microservices. [Spring Cloud Config Website](https://spring.io/projects/spring-cloud-config)
- **Spring Cloud Bus**: Implementação do Spring Cloud para comunicação entre microservices. [Spring Cloud Bus Website](https://spring.io/projects/spring-cloud-bus)
- **Resilience4j**: Biblioteca para tolerância a falhas e resiliência em microservices. [Resilience4j Website](https://resilience4j.readme.io)
- **Spring Cloud Gateway**: Gateway para roteamento e filtragem em microservices. [Spring Cloud Gateway Website](https://spring.io/projects/spring-cloud-gateway)
- **Stripe Rate Limiter**: Padrão de limite de taxa de requisições. [Stripe Rate Limiter Blog](https://stripe.com/blog/rate-limiters)
- **Apache Benchmark**: Ferramenta para benchmarking de servidores HTTP. [Apache Benchmark Website](https://httpd.apache.org)
- **Grafana Loki**: Sistema de agregação de logs. [Grafana Loki Setup](https://grafana.com/docs/loki/latest/get-started/quick-start/)
- **Micrometer**: Biblioteca para métricas em Java. [Micrometer Website](https://micrometer.io)
- **OpenTelemetry**: Framework para instrumentação de código e coleta de dados de telemetria. [OpenTelemetry Website](https://opentelemetry.io)
- **Keycloak**: Servidor de identidade e acesso. [Keycloak Website](https://www.keycloak.org)
- **Docker Compose**: Ferramenta para definir e executar aplicações Docker multi-container. [Docker Compose Website](https://docs.docker.com/compose/)
- **Buildpacks**: Conjunto de ferramentas para empacotar aplicações. [Buildpacks Website](https://buildpacks.io)
- **Google Jib**: Ferramenta para construir imagens Docker para aplicações Java sem Dockerfile. [Google Jib Website](https://github.com/GoogleContainerTools/jib)
- **Twelve-Factor Methodology**: Metodologia para construção de aplicações SaaS. [Twelve-Factor Methodology](https://12factor.net)
- **Beyond the Twelve-Factor App**: Livro sobre práticas modernas de desenvolvimento de aplicações. [Beyond the Twelve-Factor App Book](https://www.oreilly.com/library/view/beyond-the-twelve-factor/9781492042631)
- **Spring Cloud Kubernetes**: Integração do Spring Cloud com Kubernetes. [Spring Cloud Kubernetes Website](https://spring.io/projects/spring-cloud-kubernetes)
- **Istio**: Plataforma de service mesh para controlar o tráfego entre serviços. [Istio Website](https://istio.io)

## Estrutura do Projeto

O projeto está estruturado da seguinte forma:

- **`/src`:** Contém o código fonte da aplicação, incluindo controllers, services, repositories, models, DTOs, etc.
- **`/config`:** Configurações específicas da aplicação, como arquivos de propriedades e configurações do Spring.
- **`/docs`:** Documentação adicional, incluindo especificações OpenAPI e arquivos Swagger.
- **`/scripts`:** Scripts utilitários para automação de tarefas, como scripts de inicialização do Docker e Kubernetes.

## Comandos do Kubernetes Utilizados no Curso

|     Comando Kubernetes       |     Descrição          |
| ------------- | ------------- |
| "kubectl apply -f filename" | Para criar um deployment/service/configmap com base em um arquivo YAML fornecido |
| "kubectl get all" | Para obter todos os componentes dentro do seu cluster |
| "kubectl get pods" | Para obter todos os detalhes dos pods dentro do seu cluster |
| "kubectl get pod pod-id" | Para obter os detalhes de um pod específico pelo ID |
| "kubectl describe pod pod-id" | Para obter mais detalhes de um pod específico pelo ID |
| "kubectl delete pod pod-id" | Para excluir um pod específico do cluster |
| "kubectl get services" | Para obter todos os detalhes dos serviços dentro do seu cluster |
| "kubectl get service service-id" | Para obter os detalhes de um serviço específico pelo ID |
| "kubectl describe service service-id" | Para obter mais detalhes de um serviço específico pelo ID |
| "kubectl get nodes" | Para obter todos os detalhes dos nós dentro do seu cluster |
| "kubectl get node node-id" | Para obter os detalhes de um nó específico |
| "kubectl get replicasets" | Para obter todos os detalhes dos conjuntos de réplicas dentro do seu cluster |
| "kubectl get replicaset replicaset-id" | Para obter os detalhes de um conjunto de réplicas específico |
| "kubectl get deployments" | Para obter todos os detalhes dos deployments dentro do seu cluster |
| "kubectl get deployment deployment-id" | Para obter os detalhes de um deployment específico |
| "kubectl get configmaps" | Para obter todos os detalhes dos configmaps dentro do seu cluster |
| "kubectl get configmap configmap-id" | Para obter os detalhes de um configmap específico |
| "kubectl get events --sort-by=.metadata.creationTimestamp" | Para obter todos os eventos ocorridos dentro do seu cluster, ordenados por data de criação |
| "kubectl scale deployment accounts-deployment --replicas=1" | Para definir o número de réplicas para um deployment dentro do seu cluster |
| "kubectl set image deployment gatewayserver-deployment gatewayserver=eazybytes/gatewayserver:s11 --record" | Para definir uma nova imagem para um deployment dentro do seu cluster |
| "kubectl rollout history deployment gatewayserver-deployment" | Para ver o histórico de rollout de um deployment dentro do seu cluster |
| "kubectl rollout undo deployment gatewayserver-deployment --to-revision=1" | Para reverter para uma revisão anterior de um deployment dentro do seu cluster |
| "kubectl get pvc" | Para listar os PersistentVolumeClaims (PVCs) dentro do seu cluster |
| "kubectl delete pvc data-happy-panda-mariadb-0" | Para excluir um PVC específico dentro do seu cluster |

## Comandos do Helm Utilizados no Curso

|     Comando Helm       |     Descrição          |
| ------------- | ------------- |
| "helm create [NAME]" | Cria um chart padrão com o nome fornecido |
| "helm dependencies build" | Para reconstruir o chart do Helm fornecido |
| "helm install [NAME] [CHART]" | Instala o chart do Helm fornecido no cluster Kubernetes |
| "helm upgrade [NAME] [CHART]" | Atualiza uma versão específica de um release para uma nova versão de um chart |
| "helm history [NAME]" | Exibe as revisões históricas para um release específico |
| "helm rollback [NAME] [REVISION]" | Faz rollback de um release para uma revisão anterior |
| "helm uninstall [NAME]" | Desinstala todos os recursos associados a um release específico |
| "helm template [NAME] [CHART]" | Renderiza localmente os templates do chart junto com os valores |
| "helm list" | Lista todos os releases do Helm dentro de um cluster Kubernetes |
