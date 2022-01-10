package sbg.pe.ui;

import org.springframework.core.annotation.Order;

import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.spring.annotation.SpringComponent;
import com.vaadin.flow.spring.annotation.UIScope;

@SpringComponent
@UIScope
@Order(1)
public class ProjectsTabPage extends VerticalLayout implements TabPage {

	private static final long serialVersionUID = -4208231774975059884L;

	@Override
	public Component getComponent() {
		return this;
	}

	@Override
	public String getName() {
		return "Projects";
	}
}
