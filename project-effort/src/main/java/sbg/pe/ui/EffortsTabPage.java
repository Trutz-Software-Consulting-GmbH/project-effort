package sbg.pe.ui;

import org.springframework.core.annotation.Order;

import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.spring.annotation.SpringComponent;
import com.vaadin.flow.spring.annotation.UIScope;

@SpringComponent
@UIScope
@Order(2)
public class EffortsTabPage extends VerticalLayout implements TabPage {

	private static final long serialVersionUID = 6425395129754017997L;

	@Override
	public Component getComponent() {
		return this;
	}

	@Override
	public String getName() {
		return "Efforts";
	}

}
