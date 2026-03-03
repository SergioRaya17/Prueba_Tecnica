**Q1. In a Camunda BPMN process, what is the difference between a Service Task using a Java Delegate and a Service Task using an External Task?**

No tenía conocimientos sobre estos conceptos, concretos de camunda, pero investigando me ha dado a entender que mientras que un Servicio de tareas que usa Java Delegate, es asíncrono y monolítico ejecutandose todo dentro de camunda pudiendo haber bloqueos si falla, el servicio de tareas externas como su nombre indica saca los procesos fuera de camunda externalizando asi si hay un bloqueo pero evitando que afecte a al sistema de camunda.

---

**Q2. In a BPMN model, when would you use a Boundary Error Event, and what happens to the process flow when it is triggered?**

Tampoco tenia conocimiento previo sobre este concepto, he estado investigando y lo usaría en el caso de que quisiera tener control y aviso sobre un fallo de negocio concreto y controlado que se sepa que puede suceder para que se avise de tal fallo cuando ocurra 

---

**Q3. Describe a real scenario where a Parallel Gateway is more appropriate than an Exclusive Gateway.**

Entiendo por lo que he leido que cuando un proceso requiere de multitarea la más adecuada es Parallel Gateway mientras que cuando no se requiere multitarea se usa el Exclusive Gateway.
