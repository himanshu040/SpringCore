package com.springcore.ci;

public class Certificate {
             public Certificate(String name) {
		super();
		this.name = name;
	}

			String name;

			public String getName() {
				return name;
			}

			public void setName(String name) {
				this.name = name;
			}

			@Override
			public String toString() {
				return "Certificate [name=" + name + "]";
			}

			public Certificate() {
				super();
				// TODO Auto-generated constructor stub
			}
            
}
