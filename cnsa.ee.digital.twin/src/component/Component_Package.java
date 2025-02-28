/**
 */
package component;

import base.Base_Package;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see component.Component_Factory
 * @model kind="package"
 * @generated
 */
public interface Component_Package extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "component";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://cnsa.ee.digital.twin/component";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "component_";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Component_Package eINSTANCE = component.impl.Component_PackageImpl.init();

	/**
	 * The meta object id for the '{@link component.impl.ComponentElementImpl <em>Component Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see component.impl.ComponentElementImpl
	 * @see component.impl.Component_PackageImpl#getComponentElement()
	 * @generated
	 */
	int COMPONENT_ELEMENT = 0;

	/**
	 * The feature id for the '<em><b>Gid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_ELEMENT__GID = Base_Package.ARTIFACT_ELEMENT__GID;

	/**
	 * The feature id for the '<em><b>Is Citation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_ELEMENT__IS_CITATION = Base_Package.ARTIFACT_ELEMENT__IS_CITATION;

	/**
	 * The feature id for the '<em><b>Is Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_ELEMENT__IS_ABSTRACT = Base_Package.ARTIFACT_ELEMENT__IS_ABSTRACT;

	/**
	 * The feature id for the '<em><b>Cited Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_ELEMENT__CITED_ELEMENT = Base_Package.ARTIFACT_ELEMENT__CITED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Coordinate</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_ELEMENT__COORDINATE = Base_Package.ARTIFACT_ELEMENT__COORDINATE;

	/**
	 * The feature id for the '<em><b>Dimension</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_ELEMENT__DIMENSION = Base_Package.ARTIFACT_ELEMENT__DIMENSION;

	/**
	 * The feature id for the '<em><b>Heading</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_ELEMENT__HEADING = Base_Package.ARTIFACT_ELEMENT__HEADING;

	/**
	 * The feature id for the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_ELEMENT__NAME = Base_Package.ARTIFACT_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_ELEMENT__DESCRIPTION = Base_Package.ARTIFACT_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Implementation Constraint</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_ELEMENT__IMPLEMENTATION_CONSTRAINT = Base_Package.ARTIFACT_ELEMENT__IMPLEMENTATION_CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Note</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_ELEMENT__NOTE = Base_Package.ARTIFACT_ELEMENT__NOTE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_ELEMENT__TAGGED_VALUE = Base_Package.ARTIFACT_ELEMENT__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>External Reference</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_ELEMENT__EXTERNAL_REFERENCE = Base_Package.ARTIFACT_ELEMENT__EXTERNAL_REFERENCE;

	/**
	 * The number of structural features of the '<em>Component Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_ELEMENT_FEATURE_COUNT = Base_Package.ARTIFACT_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link component.impl.ComponentPackageImpl <em>Component Package</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see component.impl.ComponentPackageImpl
	 * @see component.impl.Component_PackageImpl#getComponentPackage()
	 * @generated
	 */
	int COMPONENT_PACKAGE = 1;

	/**
	 * The feature id for the '<em><b>Gid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_PACKAGE__GID = COMPONENT_ELEMENT__GID;

	/**
	 * The feature id for the '<em><b>Is Citation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_PACKAGE__IS_CITATION = COMPONENT_ELEMENT__IS_CITATION;

	/**
	 * The feature id for the '<em><b>Is Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_PACKAGE__IS_ABSTRACT = COMPONENT_ELEMENT__IS_ABSTRACT;

	/**
	 * The feature id for the '<em><b>Cited Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_PACKAGE__CITED_ELEMENT = COMPONENT_ELEMENT__CITED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Coordinate</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_PACKAGE__COORDINATE = COMPONENT_ELEMENT__COORDINATE;

	/**
	 * The feature id for the '<em><b>Dimension</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_PACKAGE__DIMENSION = COMPONENT_ELEMENT__DIMENSION;

	/**
	 * The feature id for the '<em><b>Heading</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_PACKAGE__HEADING = COMPONENT_ELEMENT__HEADING;

	/**
	 * The feature id for the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_PACKAGE__NAME = COMPONENT_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_PACKAGE__DESCRIPTION = COMPONENT_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Implementation Constraint</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_PACKAGE__IMPLEMENTATION_CONSTRAINT = COMPONENT_ELEMENT__IMPLEMENTATION_CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Note</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_PACKAGE__NOTE = COMPONENT_ELEMENT__NOTE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_PACKAGE__TAGGED_VALUE = COMPONENT_ELEMENT__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>External Reference</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_PACKAGE__EXTERNAL_REFERENCE = COMPONENT_ELEMENT__EXTERNAL_REFERENCE;

	/**
	 * The feature id for the '<em><b>Components</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_PACKAGE__COMPONENTS = COMPONENT_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Interface</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_PACKAGE__INTERFACE = COMPONENT_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Component Package</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_PACKAGE_FEATURE_COUNT = COMPONENT_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link component.impl.ComponentPackageInterfaceImpl <em>Component Package Interface</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see component.impl.ComponentPackageInterfaceImpl
	 * @see component.impl.Component_PackageImpl#getComponentPackageInterface()
	 * @generated
	 */
	int COMPONENT_PACKAGE_INTERFACE = 2;

	/**
	 * The feature id for the '<em><b>Gid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_PACKAGE_INTERFACE__GID = COMPONENT_ELEMENT__GID;

	/**
	 * The feature id for the '<em><b>Is Citation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_PACKAGE_INTERFACE__IS_CITATION = COMPONENT_ELEMENT__IS_CITATION;

	/**
	 * The feature id for the '<em><b>Is Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_PACKAGE_INTERFACE__IS_ABSTRACT = COMPONENT_ELEMENT__IS_ABSTRACT;

	/**
	 * The feature id for the '<em><b>Cited Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_PACKAGE_INTERFACE__CITED_ELEMENT = COMPONENT_ELEMENT__CITED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Coordinate</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_PACKAGE_INTERFACE__COORDINATE = COMPONENT_ELEMENT__COORDINATE;

	/**
	 * The feature id for the '<em><b>Dimension</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_PACKAGE_INTERFACE__DIMENSION = COMPONENT_ELEMENT__DIMENSION;

	/**
	 * The feature id for the '<em><b>Heading</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_PACKAGE_INTERFACE__HEADING = COMPONENT_ELEMENT__HEADING;

	/**
	 * The feature id for the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_PACKAGE_INTERFACE__NAME = COMPONENT_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_PACKAGE_INTERFACE__DESCRIPTION = COMPONENT_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Implementation Constraint</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_PACKAGE_INTERFACE__IMPLEMENTATION_CONSTRAINT = COMPONENT_ELEMENT__IMPLEMENTATION_CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Note</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_PACKAGE_INTERFACE__NOTE = COMPONENT_ELEMENT__NOTE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_PACKAGE_INTERFACE__TAGGED_VALUE = COMPONENT_ELEMENT__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>External Reference</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_PACKAGE_INTERFACE__EXTERNAL_REFERENCE = COMPONENT_ELEMENT__EXTERNAL_REFERENCE;

	/**
	 * The feature id for the '<em><b>Implements</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_PACKAGE_INTERFACE__IMPLEMENTS = COMPONENT_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Component Package Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_PACKAGE_INTERFACE_FEATURE_COUNT = COMPONENT_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link component.impl.ComponentPackageBindingImpl <em>Component Package Binding</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see component.impl.ComponentPackageBindingImpl
	 * @see component.impl.Component_PackageImpl#getComponentPackageBinding()
	 * @generated
	 */
	int COMPONENT_PACKAGE_BINDING = 3;

	/**
	 * The feature id for the '<em><b>Gid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_PACKAGE_BINDING__GID = COMPONENT_ELEMENT__GID;

	/**
	 * The feature id for the '<em><b>Is Citation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_PACKAGE_BINDING__IS_CITATION = COMPONENT_ELEMENT__IS_CITATION;

	/**
	 * The feature id for the '<em><b>Is Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_PACKAGE_BINDING__IS_ABSTRACT = COMPONENT_ELEMENT__IS_ABSTRACT;

	/**
	 * The feature id for the '<em><b>Cited Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_PACKAGE_BINDING__CITED_ELEMENT = COMPONENT_ELEMENT__CITED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Coordinate</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_PACKAGE_BINDING__COORDINATE = COMPONENT_ELEMENT__COORDINATE;

	/**
	 * The feature id for the '<em><b>Dimension</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_PACKAGE_BINDING__DIMENSION = COMPONENT_ELEMENT__DIMENSION;

	/**
	 * The feature id for the '<em><b>Heading</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_PACKAGE_BINDING__HEADING = COMPONENT_ELEMENT__HEADING;

	/**
	 * The feature id for the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_PACKAGE_BINDING__NAME = COMPONENT_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_PACKAGE_BINDING__DESCRIPTION = COMPONENT_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Implementation Constraint</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_PACKAGE_BINDING__IMPLEMENTATION_CONSTRAINT = COMPONENT_ELEMENT__IMPLEMENTATION_CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Note</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_PACKAGE_BINDING__NOTE = COMPONENT_ELEMENT__NOTE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_PACKAGE_BINDING__TAGGED_VALUE = COMPONENT_ELEMENT__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>External Reference</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_PACKAGE_BINDING__EXTERNAL_REFERENCE = COMPONENT_ELEMENT__EXTERNAL_REFERENCE;

	/**
	 * The feature id for the '<em><b>Participant Package</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_PACKAGE_BINDING__PARTICIPANT_PACKAGE = COMPONENT_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Component Package Binding</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_PACKAGE_BINDING_FEATURE_COUNT = COMPONENT_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link component.impl.ComponentImpl <em>Component</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see component.impl.ComponentImpl
	 * @see component.impl.Component_PackageImpl#getComponent()
	 * @generated
	 */
	int COMPONENT = 4;

	/**
	 * The feature id for the '<em><b>Gid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__GID = COMPONENT_ELEMENT__GID;

	/**
	 * The feature id for the '<em><b>Is Citation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__IS_CITATION = COMPONENT_ELEMENT__IS_CITATION;

	/**
	 * The feature id for the '<em><b>Is Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__IS_ABSTRACT = COMPONENT_ELEMENT__IS_ABSTRACT;

	/**
	 * The feature id for the '<em><b>Cited Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__CITED_ELEMENT = COMPONENT_ELEMENT__CITED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Coordinate</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__COORDINATE = COMPONENT_ELEMENT__COORDINATE;

	/**
	 * The feature id for the '<em><b>Dimension</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__DIMENSION = COMPONENT_ELEMENT__DIMENSION;

	/**
	 * The feature id for the '<em><b>Heading</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__HEADING = COMPONENT_ELEMENT__HEADING;

	/**
	 * The feature id for the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__NAME = COMPONENT_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__DESCRIPTION = COMPONENT_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Implementation Constraint</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__IMPLEMENTATION_CONSTRAINT = COMPONENT_ELEMENT__IMPLEMENTATION_CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Note</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__NOTE = COMPONENT_ELEMENT__NOTE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__TAGGED_VALUE = COMPONENT_ELEMENT__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>External Reference</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__EXTERNAL_REFERENCE = COMPONENT_ELEMENT__EXTERNAL_REFERENCE;

	/**
	 * The feature id for the '<em><b>Dynamic</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__DYNAMIC = COMPONENT_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Identity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__IDENTITY = COMPONENT_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Component name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__COMPONENT_NAME = COMPONENT_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Reuse</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__REUSE = COMPONENT_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Cots</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__COTS = COMPONENT_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Fit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__FIT = COMPONENT_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Safety related</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__SAFETY_RELATED = COMPONENT_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Sil</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__SIL = COMPONENT_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Readings</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__READINGS = COMPONENT_ELEMENT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Block Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__BLOCK_TYPE = COMPONENT_ELEMENT_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Function</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__FUNCTION = COMPONENT_ELEMENT_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Component Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__COMPONENT_TYPE = COMPONENT_ELEMENT_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Inputs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__INPUTS = COMPONENT_ELEMENT_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Outputs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__OUTPUTS = COMPONENT_ELEMENT_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Lports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__LPORTS = COMPONENT_ELEMENT_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Rports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__RPORTS = COMPONENT_ELEMENT_FEATURE_COUNT + 15;

	/**
	 * The feature id for the '<em><b>Sub components</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__SUB_COMPONENTS = COMPONENT_ELEMENT_FEATURE_COUNT + 16;

	/**
	 * The feature id for the '<em><b>Failure modes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__FAILURE_MODES = COMPONENT_ELEMENT_FEATURE_COUNT + 17;

	/**
	 * The feature id for the '<em><b>Safety mechanisms</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__SAFETY_MECHANISMS = COMPONENT_ELEMENT_FEATURE_COUNT + 18;

	/**
	 * The feature id for the '<em><b>Requirements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__REQUIREMENTS = COMPONENT_ELEMENT_FEATURE_COUNT + 19;

	/**
	 * The feature id for the '<em><b>Reading</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__READING = COMPONENT_ELEMENT_FEATURE_COUNT + 20;

	/**
	 * The feature id for the '<em><b>Faulty</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__FAULTY = COMPONENT_ELEMENT_FEATURE_COUNT + 21;

	/**
	 * The feature id for the '<em><b>Running Normally</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__RUNNING_NORMALLY = COMPONENT_ELEMENT_FEATURE_COUNT + 22;

	/**
	 * The feature id for the '<em><b>Running Abnormally</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__RUNNING_ABNORMALLY = COMPONENT_ELEMENT_FEATURE_COUNT + 23;

	/**
	 * The feature id for the '<em><b>To Be Predicted</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__TO_BE_PREDICTED = COMPONENT_ELEMENT_FEATURE_COUNT + 24;

	/**
	 * The number of structural features of the '<em>Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_FEATURE_COUNT = COMPONENT_ELEMENT_FEATURE_COUNT + 25;

	/**
	 * The meta object id for the '{@link component.impl.ComponentRelationshipImpl <em>Component Relationship</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see component.impl.ComponentRelationshipImpl
	 * @see component.impl.Component_PackageImpl#getComponentRelationship()
	 * @generated
	 */
	int COMPONENT_RELATIONSHIP = 5;

	/**
	 * The feature id for the '<em><b>Gid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_RELATIONSHIP__GID = COMPONENT_ELEMENT__GID;

	/**
	 * The feature id for the '<em><b>Is Citation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_RELATIONSHIP__IS_CITATION = COMPONENT_ELEMENT__IS_CITATION;

	/**
	 * The feature id for the '<em><b>Is Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_RELATIONSHIP__IS_ABSTRACT = COMPONENT_ELEMENT__IS_ABSTRACT;

	/**
	 * The feature id for the '<em><b>Cited Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_RELATIONSHIP__CITED_ELEMENT = COMPONENT_ELEMENT__CITED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Coordinate</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_RELATIONSHIP__COORDINATE = COMPONENT_ELEMENT__COORDINATE;

	/**
	 * The feature id for the '<em><b>Dimension</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_RELATIONSHIP__DIMENSION = COMPONENT_ELEMENT__DIMENSION;

	/**
	 * The feature id for the '<em><b>Heading</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_RELATIONSHIP__HEADING = COMPONENT_ELEMENT__HEADING;

	/**
	 * The feature id for the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_RELATIONSHIP__NAME = COMPONENT_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_RELATIONSHIP__DESCRIPTION = COMPONENT_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Implementation Constraint</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_RELATIONSHIP__IMPLEMENTATION_CONSTRAINT = COMPONENT_ELEMENT__IMPLEMENTATION_CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Note</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_RELATIONSHIP__NOTE = COMPONENT_ELEMENT__NOTE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_RELATIONSHIP__TAGGED_VALUE = COMPONENT_ELEMENT__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>External Reference</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_RELATIONSHIP__EXTERNAL_REFERENCE = COMPONENT_ELEMENT__EXTERNAL_REFERENCE;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_RELATIONSHIP__LABEL = COMPONENT_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Component Relationship</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_RELATIONSHIP_FEATURE_COUNT = COMPONENT_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link component.impl.DirectedRelationshipImpl <em>Directed Relationship</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see component.impl.DirectedRelationshipImpl
	 * @see component.impl.Component_PackageImpl#getDirectedRelationship()
	 * @generated
	 */
	int DIRECTED_RELATIONSHIP = 6;

	/**
	 * The feature id for the '<em><b>Gid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECTED_RELATIONSHIP__GID = COMPONENT_RELATIONSHIP__GID;

	/**
	 * The feature id for the '<em><b>Is Citation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECTED_RELATIONSHIP__IS_CITATION = COMPONENT_RELATIONSHIP__IS_CITATION;

	/**
	 * The feature id for the '<em><b>Is Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECTED_RELATIONSHIP__IS_ABSTRACT = COMPONENT_RELATIONSHIP__IS_ABSTRACT;

	/**
	 * The feature id for the '<em><b>Cited Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECTED_RELATIONSHIP__CITED_ELEMENT = COMPONENT_RELATIONSHIP__CITED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Coordinate</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECTED_RELATIONSHIP__COORDINATE = COMPONENT_RELATIONSHIP__COORDINATE;

	/**
	 * The feature id for the '<em><b>Dimension</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECTED_RELATIONSHIP__DIMENSION = COMPONENT_RELATIONSHIP__DIMENSION;

	/**
	 * The feature id for the '<em><b>Heading</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECTED_RELATIONSHIP__HEADING = COMPONENT_RELATIONSHIP__HEADING;

	/**
	 * The feature id for the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECTED_RELATIONSHIP__NAME = COMPONENT_RELATIONSHIP__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECTED_RELATIONSHIP__DESCRIPTION = COMPONENT_RELATIONSHIP__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Implementation Constraint</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECTED_RELATIONSHIP__IMPLEMENTATION_CONSTRAINT = COMPONENT_RELATIONSHIP__IMPLEMENTATION_CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Note</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECTED_RELATIONSHIP__NOTE = COMPONENT_RELATIONSHIP__NOTE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECTED_RELATIONSHIP__TAGGED_VALUE = COMPONENT_RELATIONSHIP__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>External Reference</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECTED_RELATIONSHIP__EXTERNAL_REFERENCE = COMPONENT_RELATIONSHIP__EXTERNAL_REFERENCE;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECTED_RELATIONSHIP__LABEL = COMPONENT_RELATIONSHIP__LABEL;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECTED_RELATIONSHIP__SOURCE = COMPONENT_RELATIONSHIP_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECTED_RELATIONSHIP__TARGET = COMPONENT_RELATIONSHIP_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Faulty</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECTED_RELATIONSHIP__FAULTY = COMPONENT_RELATIONSHIP_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Running Normally</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECTED_RELATIONSHIP__RUNNING_NORMALLY = COMPONENT_RELATIONSHIP_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Running Abnormally</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECTED_RELATIONSHIP__RUNNING_ABNORMALLY = COMPONENT_RELATIONSHIP_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>To Be Predicted</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECTED_RELATIONSHIP__TO_BE_PREDICTED = COMPONENT_RELATIONSHIP_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Directed Relationship</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECTED_RELATIONSHIP_FEATURE_COUNT = COMPONENT_RELATIONSHIP_FEATURE_COUNT + 6;

	/**
	 * The meta object id for the '{@link component.impl.UndirectedRelationshipImpl <em>Undirected Relationship</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see component.impl.UndirectedRelationshipImpl
	 * @see component.impl.Component_PackageImpl#getUndirectedRelationship()
	 * @generated
	 */
	int UNDIRECTED_RELATIONSHIP = 7;

	/**
	 * The feature id for the '<em><b>Gid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNDIRECTED_RELATIONSHIP__GID = COMPONENT_RELATIONSHIP__GID;

	/**
	 * The feature id for the '<em><b>Is Citation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNDIRECTED_RELATIONSHIP__IS_CITATION = COMPONENT_RELATIONSHIP__IS_CITATION;

	/**
	 * The feature id for the '<em><b>Is Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNDIRECTED_RELATIONSHIP__IS_ABSTRACT = COMPONENT_RELATIONSHIP__IS_ABSTRACT;

	/**
	 * The feature id for the '<em><b>Cited Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNDIRECTED_RELATIONSHIP__CITED_ELEMENT = COMPONENT_RELATIONSHIP__CITED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Coordinate</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNDIRECTED_RELATIONSHIP__COORDINATE = COMPONENT_RELATIONSHIP__COORDINATE;

	/**
	 * The feature id for the '<em><b>Dimension</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNDIRECTED_RELATIONSHIP__DIMENSION = COMPONENT_RELATIONSHIP__DIMENSION;

	/**
	 * The feature id for the '<em><b>Heading</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNDIRECTED_RELATIONSHIP__HEADING = COMPONENT_RELATIONSHIP__HEADING;

	/**
	 * The feature id for the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNDIRECTED_RELATIONSHIP__NAME = COMPONENT_RELATIONSHIP__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNDIRECTED_RELATIONSHIP__DESCRIPTION = COMPONENT_RELATIONSHIP__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Implementation Constraint</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNDIRECTED_RELATIONSHIP__IMPLEMENTATION_CONSTRAINT = COMPONENT_RELATIONSHIP__IMPLEMENTATION_CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Note</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNDIRECTED_RELATIONSHIP__NOTE = COMPONENT_RELATIONSHIP__NOTE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNDIRECTED_RELATIONSHIP__TAGGED_VALUE = COMPONENT_RELATIONSHIP__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>External Reference</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNDIRECTED_RELATIONSHIP__EXTERNAL_REFERENCE = COMPONENT_RELATIONSHIP__EXTERNAL_REFERENCE;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNDIRECTED_RELATIONSHIP__LABEL = COMPONENT_RELATIONSHIP__LABEL;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNDIRECTED_RELATIONSHIP__SOURCE = COMPONENT_RELATIONSHIP_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNDIRECTED_RELATIONSHIP__TARGET = COMPONENT_RELATIONSHIP_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Undirected Relationship</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNDIRECTED_RELATIONSHIP_FEATURE_COUNT = COMPONENT_RELATIONSHIP_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link component.impl.ComponentAssetImpl <em>Component Asset</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see component.impl.ComponentAssetImpl
	 * @see component.impl.Component_PackageImpl#getComponentAsset()
	 * @generated
	 */
	int COMPONENT_ASSET = 8;

	/**
	 * The feature id for the '<em><b>Gid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_ASSET__GID = COMPONENT_ELEMENT__GID;

	/**
	 * The feature id for the '<em><b>Is Citation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_ASSET__IS_CITATION = COMPONENT_ELEMENT__IS_CITATION;

	/**
	 * The feature id for the '<em><b>Is Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_ASSET__IS_ABSTRACT = COMPONENT_ELEMENT__IS_ABSTRACT;

	/**
	 * The feature id for the '<em><b>Cited Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_ASSET__CITED_ELEMENT = COMPONENT_ELEMENT__CITED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Coordinate</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_ASSET__COORDINATE = COMPONENT_ELEMENT__COORDINATE;

	/**
	 * The feature id for the '<em><b>Dimension</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_ASSET__DIMENSION = COMPONENT_ELEMENT__DIMENSION;

	/**
	 * The feature id for the '<em><b>Heading</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_ASSET__HEADING = COMPONENT_ELEMENT__HEADING;

	/**
	 * The feature id for the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_ASSET__NAME = COMPONENT_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_ASSET__DESCRIPTION = COMPONENT_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Implementation Constraint</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_ASSET__IMPLEMENTATION_CONSTRAINT = COMPONENT_ELEMENT__IMPLEMENTATION_CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Note</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_ASSET__NOTE = COMPONENT_ELEMENT__NOTE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_ASSET__TAGGED_VALUE = COMPONENT_ELEMENT__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>External Reference</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_ASSET__EXTERNAL_REFERENCE = COMPONENT_ELEMENT__EXTERNAL_REFERENCE;

	/**
	 * The number of structural features of the '<em>Component Asset</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_ASSET_FEATURE_COUNT = COMPONENT_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link component.impl.UtilityNodesImpl <em>Utility Nodes</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see component.impl.UtilityNodesImpl
	 * @see component.impl.Component_PackageImpl#getUtilityNodes()
	 * @generated
	 */
	int UTILITY_NODES = 9;

	/**
	 * The feature id for the '<em><b>Gid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UTILITY_NODES__GID = COMPONENT_ASSET__GID;

	/**
	 * The feature id for the '<em><b>Is Citation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UTILITY_NODES__IS_CITATION = COMPONENT_ASSET__IS_CITATION;

	/**
	 * The feature id for the '<em><b>Is Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UTILITY_NODES__IS_ABSTRACT = COMPONENT_ASSET__IS_ABSTRACT;

	/**
	 * The feature id for the '<em><b>Cited Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UTILITY_NODES__CITED_ELEMENT = COMPONENT_ASSET__CITED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Coordinate</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UTILITY_NODES__COORDINATE = COMPONENT_ASSET__COORDINATE;

	/**
	 * The feature id for the '<em><b>Dimension</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UTILITY_NODES__DIMENSION = COMPONENT_ASSET__DIMENSION;

	/**
	 * The feature id for the '<em><b>Heading</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UTILITY_NODES__HEADING = COMPONENT_ASSET__HEADING;

	/**
	 * The feature id for the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UTILITY_NODES__NAME = COMPONENT_ASSET__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UTILITY_NODES__DESCRIPTION = COMPONENT_ASSET__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Implementation Constraint</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UTILITY_NODES__IMPLEMENTATION_CONSTRAINT = COMPONENT_ASSET__IMPLEMENTATION_CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Note</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UTILITY_NODES__NOTE = COMPONENT_ASSET__NOTE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UTILITY_NODES__TAGGED_VALUE = COMPONENT_ASSET__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>External Reference</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UTILITY_NODES__EXTERNAL_REFERENCE = COMPONENT_ASSET__EXTERNAL_REFERENCE;

	/**
	 * The feature id for the '<em><b>Reading</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UTILITY_NODES__READING = COMPONENT_ASSET_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Utility Nodes</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UTILITY_NODES_FEATURE_COUNT = COMPONENT_ASSET_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link component.impl.TransitionNodeImpl <em>Transition Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see component.impl.TransitionNodeImpl
	 * @see component.impl.Component_PackageImpl#getTransitionNode()
	 * @generated
	 */
	int TRANSITION_NODE = 10;

	/**
	 * The feature id for the '<em><b>Gid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_NODE__GID = UTILITY_NODES__GID;

	/**
	 * The feature id for the '<em><b>Is Citation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_NODE__IS_CITATION = UTILITY_NODES__IS_CITATION;

	/**
	 * The feature id for the '<em><b>Is Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_NODE__IS_ABSTRACT = UTILITY_NODES__IS_ABSTRACT;

	/**
	 * The feature id for the '<em><b>Cited Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_NODE__CITED_ELEMENT = UTILITY_NODES__CITED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Coordinate</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_NODE__COORDINATE = UTILITY_NODES__COORDINATE;

	/**
	 * The feature id for the '<em><b>Dimension</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_NODE__DIMENSION = UTILITY_NODES__DIMENSION;

	/**
	 * The feature id for the '<em><b>Heading</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_NODE__HEADING = UTILITY_NODES__HEADING;

	/**
	 * The feature id for the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_NODE__NAME = UTILITY_NODES__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_NODE__DESCRIPTION = UTILITY_NODES__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Implementation Constraint</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_NODE__IMPLEMENTATION_CONSTRAINT = UTILITY_NODES__IMPLEMENTATION_CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Note</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_NODE__NOTE = UTILITY_NODES__NOTE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_NODE__TAGGED_VALUE = UTILITY_NODES__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>External Reference</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_NODE__EXTERNAL_REFERENCE = UTILITY_NODES__EXTERNAL_REFERENCE;

	/**
	 * The feature id for the '<em><b>Reading</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_NODE__READING = UTILITY_NODES__READING;

	/**
	 * The number of structural features of the '<em>Transition Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_NODE_FEATURE_COUNT = UTILITY_NODES_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link component.impl.ForkImpl <em>Fork</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see component.impl.ForkImpl
	 * @see component.impl.Component_PackageImpl#getFork()
	 * @generated
	 */
	int FORK = 11;

	/**
	 * The feature id for the '<em><b>Gid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORK__GID = TRANSITION_NODE__GID;

	/**
	 * The feature id for the '<em><b>Is Citation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORK__IS_CITATION = TRANSITION_NODE__IS_CITATION;

	/**
	 * The feature id for the '<em><b>Is Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORK__IS_ABSTRACT = TRANSITION_NODE__IS_ABSTRACT;

	/**
	 * The feature id for the '<em><b>Cited Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORK__CITED_ELEMENT = TRANSITION_NODE__CITED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Coordinate</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORK__COORDINATE = TRANSITION_NODE__COORDINATE;

	/**
	 * The feature id for the '<em><b>Dimension</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORK__DIMENSION = TRANSITION_NODE__DIMENSION;

	/**
	 * The feature id for the '<em><b>Heading</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORK__HEADING = TRANSITION_NODE__HEADING;

	/**
	 * The feature id for the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORK__NAME = TRANSITION_NODE__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORK__DESCRIPTION = TRANSITION_NODE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Implementation Constraint</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORK__IMPLEMENTATION_CONSTRAINT = TRANSITION_NODE__IMPLEMENTATION_CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Note</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORK__NOTE = TRANSITION_NODE__NOTE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORK__TAGGED_VALUE = TRANSITION_NODE__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>External Reference</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORK__EXTERNAL_REFERENCE = TRANSITION_NODE__EXTERNAL_REFERENCE;

	/**
	 * The feature id for the '<em><b>Reading</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORK__READING = TRANSITION_NODE__READING;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORK__SOURCE = TRANSITION_NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORK__TARGET = TRANSITION_NODE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Fork</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORK_FEATURE_COUNT = TRANSITION_NODE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link component.impl.SwitchImpl <em>Switch</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see component.impl.SwitchImpl
	 * @see component.impl.Component_PackageImpl#getSwitch()
	 * @generated
	 */
	int SWITCH = 12;

	/**
	 * The feature id for the '<em><b>Gid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH__GID = TRANSITION_NODE__GID;

	/**
	 * The feature id for the '<em><b>Is Citation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH__IS_CITATION = TRANSITION_NODE__IS_CITATION;

	/**
	 * The feature id for the '<em><b>Is Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH__IS_ABSTRACT = TRANSITION_NODE__IS_ABSTRACT;

	/**
	 * The feature id for the '<em><b>Cited Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH__CITED_ELEMENT = TRANSITION_NODE__CITED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Coordinate</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH__COORDINATE = TRANSITION_NODE__COORDINATE;

	/**
	 * The feature id for the '<em><b>Dimension</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH__DIMENSION = TRANSITION_NODE__DIMENSION;

	/**
	 * The feature id for the '<em><b>Heading</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH__HEADING = TRANSITION_NODE__HEADING;

	/**
	 * The feature id for the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH__NAME = TRANSITION_NODE__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH__DESCRIPTION = TRANSITION_NODE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Implementation Constraint</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH__IMPLEMENTATION_CONSTRAINT = TRANSITION_NODE__IMPLEMENTATION_CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Note</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH__NOTE = TRANSITION_NODE__NOTE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH__TAGGED_VALUE = TRANSITION_NODE__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>External Reference</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH__EXTERNAL_REFERENCE = TRANSITION_NODE__EXTERNAL_REFERENCE;

	/**
	 * The feature id for the '<em><b>Reading</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH__READING = TRANSITION_NODE__READING;

	/**
	 * The feature id for the '<em><b>Ports</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH__PORTS = TRANSITION_NODE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Switch</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH_FEATURE_COUNT = TRANSITION_NODE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link component.impl.IONodeImpl <em>IO Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see component.impl.IONodeImpl
	 * @see component.impl.Component_PackageImpl#getIONode()
	 * @generated
	 */
	int IO_NODE = 13;

	/**
	 * The feature id for the '<em><b>Gid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IO_NODE__GID = UTILITY_NODES__GID;

	/**
	 * The feature id for the '<em><b>Is Citation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IO_NODE__IS_CITATION = UTILITY_NODES__IS_CITATION;

	/**
	 * The feature id for the '<em><b>Is Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IO_NODE__IS_ABSTRACT = UTILITY_NODES__IS_ABSTRACT;

	/**
	 * The feature id for the '<em><b>Cited Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IO_NODE__CITED_ELEMENT = UTILITY_NODES__CITED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Coordinate</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IO_NODE__COORDINATE = UTILITY_NODES__COORDINATE;

	/**
	 * The feature id for the '<em><b>Dimension</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IO_NODE__DIMENSION = UTILITY_NODES__DIMENSION;

	/**
	 * The feature id for the '<em><b>Heading</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IO_NODE__HEADING = UTILITY_NODES__HEADING;

	/**
	 * The feature id for the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IO_NODE__NAME = UTILITY_NODES__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IO_NODE__DESCRIPTION = UTILITY_NODES__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Implementation Constraint</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IO_NODE__IMPLEMENTATION_CONSTRAINT = UTILITY_NODES__IMPLEMENTATION_CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Note</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IO_NODE__NOTE = UTILITY_NODES__NOTE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IO_NODE__TAGGED_VALUE = UTILITY_NODES__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>External Reference</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IO_NODE__EXTERNAL_REFERENCE = UTILITY_NODES__EXTERNAL_REFERENCE;

	/**
	 * The feature id for the '<em><b>Reading</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IO_NODE__READING = UTILITY_NODES__READING;

	/**
	 * The feature id for the '<em><b>Upper</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IO_NODE__UPPER = UTILITY_NODES_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Lower</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IO_NODE__LOWER = UTILITY_NODES_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>IO Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IO_NODE_FEATURE_COUNT = UTILITY_NODES_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link component.impl.InputImpl <em>Input</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see component.impl.InputImpl
	 * @see component.impl.Component_PackageImpl#getInput()
	 * @generated
	 */
	int INPUT = 14;

	/**
	 * The feature id for the '<em><b>Gid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT__GID = IO_NODE__GID;

	/**
	 * The feature id for the '<em><b>Is Citation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT__IS_CITATION = IO_NODE__IS_CITATION;

	/**
	 * The feature id for the '<em><b>Is Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT__IS_ABSTRACT = IO_NODE__IS_ABSTRACT;

	/**
	 * The feature id for the '<em><b>Cited Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT__CITED_ELEMENT = IO_NODE__CITED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Coordinate</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT__COORDINATE = IO_NODE__COORDINATE;

	/**
	 * The feature id for the '<em><b>Dimension</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT__DIMENSION = IO_NODE__DIMENSION;

	/**
	 * The feature id for the '<em><b>Heading</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT__HEADING = IO_NODE__HEADING;

	/**
	 * The feature id for the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT__NAME = IO_NODE__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT__DESCRIPTION = IO_NODE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Implementation Constraint</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT__IMPLEMENTATION_CONSTRAINT = IO_NODE__IMPLEMENTATION_CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Note</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT__NOTE = IO_NODE__NOTE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT__TAGGED_VALUE = IO_NODE__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>External Reference</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT__EXTERNAL_REFERENCE = IO_NODE__EXTERNAL_REFERENCE;

	/**
	 * The feature id for the '<em><b>Reading</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT__READING = IO_NODE__READING;

	/**
	 * The feature id for the '<em><b>Upper</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT__UPPER = IO_NODE__UPPER;

	/**
	 * The feature id for the '<em><b>Lower</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT__LOWER = IO_NODE__LOWER;

	/**
	 * The feature id for the '<em><b>Faulty</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT__FAULTY = IO_NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Running Normally</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT__RUNNING_NORMALLY = IO_NODE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Running Abnormally</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT__RUNNING_ABNORMALLY = IO_NODE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>To Be Predicted</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT__TO_BE_PREDICTED = IO_NODE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Input</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_FEATURE_COUNT = IO_NODE_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link component.impl.OutputImpl <em>Output</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see component.impl.OutputImpl
	 * @see component.impl.Component_PackageImpl#getOutput()
	 * @generated
	 */
	int OUTPUT = 15;

	/**
	 * The feature id for the '<em><b>Gid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT__GID = IO_NODE__GID;

	/**
	 * The feature id for the '<em><b>Is Citation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT__IS_CITATION = IO_NODE__IS_CITATION;

	/**
	 * The feature id for the '<em><b>Is Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT__IS_ABSTRACT = IO_NODE__IS_ABSTRACT;

	/**
	 * The feature id for the '<em><b>Cited Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT__CITED_ELEMENT = IO_NODE__CITED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Coordinate</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT__COORDINATE = IO_NODE__COORDINATE;

	/**
	 * The feature id for the '<em><b>Dimension</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT__DIMENSION = IO_NODE__DIMENSION;

	/**
	 * The feature id for the '<em><b>Heading</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT__HEADING = IO_NODE__HEADING;

	/**
	 * The feature id for the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT__NAME = IO_NODE__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT__DESCRIPTION = IO_NODE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Implementation Constraint</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT__IMPLEMENTATION_CONSTRAINT = IO_NODE__IMPLEMENTATION_CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Note</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT__NOTE = IO_NODE__NOTE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT__TAGGED_VALUE = IO_NODE__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>External Reference</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT__EXTERNAL_REFERENCE = IO_NODE__EXTERNAL_REFERENCE;

	/**
	 * The feature id for the '<em><b>Reading</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT__READING = IO_NODE__READING;

	/**
	 * The feature id for the '<em><b>Upper</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT__UPPER = IO_NODE__UPPER;

	/**
	 * The feature id for the '<em><b>Lower</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT__LOWER = IO_NODE__LOWER;

	/**
	 * The feature id for the '<em><b>Faulty</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT__FAULTY = IO_NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Running Normally</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT__RUNNING_NORMALLY = IO_NODE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Running Abnormally</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT__RUNNING_ABNORMALLY = IO_NODE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>To Be Predicted</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT__TO_BE_PREDICTED = IO_NODE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Output</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_FEATURE_COUNT = IO_NODE_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link component.impl.LPortImpl <em>LPort</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see component.impl.LPortImpl
	 * @see component.impl.Component_PackageImpl#getLPort()
	 * @generated
	 */
	int LPORT = 16;

	/**
	 * The feature id for the '<em><b>Gid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LPORT__GID = IO_NODE__GID;

	/**
	 * The feature id for the '<em><b>Is Citation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LPORT__IS_CITATION = IO_NODE__IS_CITATION;

	/**
	 * The feature id for the '<em><b>Is Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LPORT__IS_ABSTRACT = IO_NODE__IS_ABSTRACT;

	/**
	 * The feature id for the '<em><b>Cited Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LPORT__CITED_ELEMENT = IO_NODE__CITED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Coordinate</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LPORT__COORDINATE = IO_NODE__COORDINATE;

	/**
	 * The feature id for the '<em><b>Dimension</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LPORT__DIMENSION = IO_NODE__DIMENSION;

	/**
	 * The feature id for the '<em><b>Heading</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LPORT__HEADING = IO_NODE__HEADING;

	/**
	 * The feature id for the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LPORT__NAME = IO_NODE__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LPORT__DESCRIPTION = IO_NODE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Implementation Constraint</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LPORT__IMPLEMENTATION_CONSTRAINT = IO_NODE__IMPLEMENTATION_CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Note</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LPORT__NOTE = IO_NODE__NOTE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LPORT__TAGGED_VALUE = IO_NODE__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>External Reference</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LPORT__EXTERNAL_REFERENCE = IO_NODE__EXTERNAL_REFERENCE;

	/**
	 * The feature id for the '<em><b>Reading</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LPORT__READING = IO_NODE__READING;

	/**
	 * The feature id for the '<em><b>Upper</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LPORT__UPPER = IO_NODE__UPPER;

	/**
	 * The feature id for the '<em><b>Lower</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LPORT__LOWER = IO_NODE__LOWER;

	/**
	 * The number of structural features of the '<em>LPort</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LPORT_FEATURE_COUNT = IO_NODE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link component.impl.RPortImpl <em>RPort</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see component.impl.RPortImpl
	 * @see component.impl.Component_PackageImpl#getRPort()
	 * @generated
	 */
	int RPORT = 17;

	/**
	 * The feature id for the '<em><b>Gid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RPORT__GID = IO_NODE__GID;

	/**
	 * The feature id for the '<em><b>Is Citation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RPORT__IS_CITATION = IO_NODE__IS_CITATION;

	/**
	 * The feature id for the '<em><b>Is Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RPORT__IS_ABSTRACT = IO_NODE__IS_ABSTRACT;

	/**
	 * The feature id for the '<em><b>Cited Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RPORT__CITED_ELEMENT = IO_NODE__CITED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Coordinate</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RPORT__COORDINATE = IO_NODE__COORDINATE;

	/**
	 * The feature id for the '<em><b>Dimension</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RPORT__DIMENSION = IO_NODE__DIMENSION;

	/**
	 * The feature id for the '<em><b>Heading</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RPORT__HEADING = IO_NODE__HEADING;

	/**
	 * The feature id for the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RPORT__NAME = IO_NODE__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RPORT__DESCRIPTION = IO_NODE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Implementation Constraint</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RPORT__IMPLEMENTATION_CONSTRAINT = IO_NODE__IMPLEMENTATION_CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Note</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RPORT__NOTE = IO_NODE__NOTE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RPORT__TAGGED_VALUE = IO_NODE__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>External Reference</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RPORT__EXTERNAL_REFERENCE = IO_NODE__EXTERNAL_REFERENCE;

	/**
	 * The feature id for the '<em><b>Reading</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RPORT__READING = IO_NODE__READING;

	/**
	 * The feature id for the '<em><b>Upper</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RPORT__UPPER = IO_NODE__UPPER;

	/**
	 * The feature id for the '<em><b>Lower</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RPORT__LOWER = IO_NODE__LOWER;

	/**
	 * The number of structural features of the '<em>RPort</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RPORT_FEATURE_COUNT = IO_NODE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link component.impl.FunctionImpl <em>Function</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see component.impl.FunctionImpl
	 * @see component.impl.Component_PackageImpl#getFunction()
	 * @generated
	 */
	int FUNCTION = 18;

	/**
	 * The feature id for the '<em><b>Gid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION__GID = COMPONENT_ASSET__GID;

	/**
	 * The feature id for the '<em><b>Is Citation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION__IS_CITATION = COMPONENT_ASSET__IS_CITATION;

	/**
	 * The feature id for the '<em><b>Is Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION__IS_ABSTRACT = COMPONENT_ASSET__IS_ABSTRACT;

	/**
	 * The feature id for the '<em><b>Cited Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION__CITED_ELEMENT = COMPONENT_ASSET__CITED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Coordinate</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION__COORDINATE = COMPONENT_ASSET__COORDINATE;

	/**
	 * The feature id for the '<em><b>Dimension</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION__DIMENSION = COMPONENT_ASSET__DIMENSION;

	/**
	 * The feature id for the '<em><b>Heading</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION__HEADING = COMPONENT_ASSET__HEADING;

	/**
	 * The feature id for the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION__NAME = COMPONENT_ASSET__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION__DESCRIPTION = COMPONENT_ASSET__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Implementation Constraint</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION__IMPLEMENTATION_CONSTRAINT = COMPONENT_ASSET__IMPLEMENTATION_CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Note</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION__NOTE = COMPONENT_ASSET__NOTE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION__TAGGED_VALUE = COMPONENT_ASSET__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>External Reference</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION__EXTERNAL_REFERENCE = COMPONENT_ASSET__EXTERNAL_REFERENCE;

	/**
	 * The feature id for the '<em><b>Func</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION__FUNC = COMPONENT_ASSET_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Tolerance Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION__TOLERANCE_TYPE = COMPONENT_ASSET_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_FEATURE_COUNT = COMPONENT_ASSET_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link component.impl.ReadingImpl <em>Reading</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see component.impl.ReadingImpl
	 * @see component.impl.Component_PackageImpl#getReading()
	 * @generated
	 */
	int READING = 19;

	/**
	 * The feature id for the '<em><b>Gid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READING__GID = COMPONENT_ASSET__GID;

	/**
	 * The feature id for the '<em><b>Is Citation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READING__IS_CITATION = COMPONENT_ASSET__IS_CITATION;

	/**
	 * The feature id for the '<em><b>Is Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READING__IS_ABSTRACT = COMPONENT_ASSET__IS_ABSTRACT;

	/**
	 * The feature id for the '<em><b>Cited Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READING__CITED_ELEMENT = COMPONENT_ASSET__CITED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Coordinate</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READING__COORDINATE = COMPONENT_ASSET__COORDINATE;

	/**
	 * The feature id for the '<em><b>Dimension</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READING__DIMENSION = COMPONENT_ASSET__DIMENSION;

	/**
	 * The feature id for the '<em><b>Heading</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READING__HEADING = COMPONENT_ASSET__HEADING;

	/**
	 * The feature id for the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READING__NAME = COMPONENT_ASSET__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READING__DESCRIPTION = COMPONENT_ASSET__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Implementation Constraint</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READING__IMPLEMENTATION_CONSTRAINT = COMPONENT_ASSET__IMPLEMENTATION_CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Note</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READING__NOTE = COMPONENT_ASSET__NOTE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READING__TAGGED_VALUE = COMPONENT_ASSET__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>External Reference</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READING__EXTERNAL_REFERENCE = COMPONENT_ASSET__EXTERNAL_REFERENCE;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READING__VALUE = COMPONENT_ASSET_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Upper value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READING__UPPER_VALUE = COMPONENT_ASSET_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Lower value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READING__LOWER_VALUE = COMPONENT_ASSET_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READING__UNIT = COMPONENT_ASSET_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Reading</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READING_FEATURE_COUNT = COMPONENT_ASSET_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link component.impl.ComponentSafetyElementImpl <em>Component Safety Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see component.impl.ComponentSafetyElementImpl
	 * @see component.impl.Component_PackageImpl#getComponentSafetyElement()
	 * @generated
	 */
	int COMPONENT_SAFETY_ELEMENT = 20;

	/**
	 * The feature id for the '<em><b>Gid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_SAFETY_ELEMENT__GID = COMPONENT_ASSET__GID;

	/**
	 * The feature id for the '<em><b>Is Citation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_SAFETY_ELEMENT__IS_CITATION = COMPONENT_ASSET__IS_CITATION;

	/**
	 * The feature id for the '<em><b>Is Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_SAFETY_ELEMENT__IS_ABSTRACT = COMPONENT_ASSET__IS_ABSTRACT;

	/**
	 * The feature id for the '<em><b>Cited Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_SAFETY_ELEMENT__CITED_ELEMENT = COMPONENT_ASSET__CITED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Coordinate</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_SAFETY_ELEMENT__COORDINATE = COMPONENT_ASSET__COORDINATE;

	/**
	 * The feature id for the '<em><b>Dimension</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_SAFETY_ELEMENT__DIMENSION = COMPONENT_ASSET__DIMENSION;

	/**
	 * The feature id for the '<em><b>Heading</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_SAFETY_ELEMENT__HEADING = COMPONENT_ASSET__HEADING;

	/**
	 * The feature id for the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_SAFETY_ELEMENT__NAME = COMPONENT_ASSET__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_SAFETY_ELEMENT__DESCRIPTION = COMPONENT_ASSET__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Implementation Constraint</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_SAFETY_ELEMENT__IMPLEMENTATION_CONSTRAINT = COMPONENT_ASSET__IMPLEMENTATION_CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Note</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_SAFETY_ELEMENT__NOTE = COMPONENT_ASSET__NOTE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_SAFETY_ELEMENT__TAGGED_VALUE = COMPONENT_ASSET__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>External Reference</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_SAFETY_ELEMENT__EXTERNAL_REFERENCE = COMPONENT_ASSET__EXTERNAL_REFERENCE;

	/**
	 * The feature id for the '<em><b>Identity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_SAFETY_ELEMENT__IDENTITY = COMPONENT_ASSET_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Component Safety Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_SAFETY_ELEMENT_FEATURE_COUNT = COMPONENT_ASSET_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link component.impl.FailureModeImpl <em>Failure Mode</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see component.impl.FailureModeImpl
	 * @see component.impl.Component_PackageImpl#getFailureMode()
	 * @generated
	 */
	int FAILURE_MODE = 21;

	/**
	 * The feature id for the '<em><b>Gid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAILURE_MODE__GID = COMPONENT_SAFETY_ELEMENT__GID;

	/**
	 * The feature id for the '<em><b>Is Citation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAILURE_MODE__IS_CITATION = COMPONENT_SAFETY_ELEMENT__IS_CITATION;

	/**
	 * The feature id for the '<em><b>Is Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAILURE_MODE__IS_ABSTRACT = COMPONENT_SAFETY_ELEMENT__IS_ABSTRACT;

	/**
	 * The feature id for the '<em><b>Cited Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAILURE_MODE__CITED_ELEMENT = COMPONENT_SAFETY_ELEMENT__CITED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Coordinate</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAILURE_MODE__COORDINATE = COMPONENT_SAFETY_ELEMENT__COORDINATE;

	/**
	 * The feature id for the '<em><b>Dimension</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAILURE_MODE__DIMENSION = COMPONENT_SAFETY_ELEMENT__DIMENSION;

	/**
	 * The feature id for the '<em><b>Heading</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAILURE_MODE__HEADING = COMPONENT_SAFETY_ELEMENT__HEADING;

	/**
	 * The feature id for the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAILURE_MODE__NAME = COMPONENT_SAFETY_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAILURE_MODE__DESCRIPTION = COMPONENT_SAFETY_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Implementation Constraint</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAILURE_MODE__IMPLEMENTATION_CONSTRAINT = COMPONENT_SAFETY_ELEMENT__IMPLEMENTATION_CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Note</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAILURE_MODE__NOTE = COMPONENT_SAFETY_ELEMENT__NOTE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAILURE_MODE__TAGGED_VALUE = COMPONENT_SAFETY_ELEMENT__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>External Reference</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAILURE_MODE__EXTERNAL_REFERENCE = COMPONENT_SAFETY_ELEMENT__EXTERNAL_REFERENCE;

	/**
	 * The feature id for the '<em><b>Identity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAILURE_MODE__IDENTITY = COMPONENT_SAFETY_ELEMENT__IDENTITY;

	/**
	 * The feature id for the '<em><b>Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAILURE_MODE__MODE = COMPONENT_SAFETY_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Cause</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAILURE_MODE__CAUSE = COMPONENT_SAFETY_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Probability</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAILURE_MODE__PROBABILITY = COMPONENT_SAFETY_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Safety related</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAILURE_MODE__SAFETY_RELATED = COMPONENT_SAFETY_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Failure Severity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAILURE_MODE__FAILURE_SEVERITY = COMPONENT_SAFETY_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Hazards</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAILURE_MODE__HAZARDS = COMPONENT_SAFETY_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Regional</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAILURE_MODE__REGIONAL = COMPONENT_SAFETY_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Higher level</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAILURE_MODE__HIGHER_LEVEL = COMPONENT_SAFETY_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Final</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAILURE_MODE__FINAL = COMPONENT_SAFETY_ELEMENT_FEATURE_COUNT + 8;

	/**
	 * The number of structural features of the '<em>Failure Mode</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAILURE_MODE_FEATURE_COUNT = COMPONENT_SAFETY_ELEMENT_FEATURE_COUNT + 9;

	/**
	 * The meta object id for the '{@link component.impl.SafetyMechanismImpl <em>Safety Mechanism</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see component.impl.SafetyMechanismImpl
	 * @see component.impl.Component_PackageImpl#getSafetyMechanism()
	 * @generated
	 */
	int SAFETY_MECHANISM = 22;

	/**
	 * The feature id for the '<em><b>Gid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAFETY_MECHANISM__GID = COMPONENT_SAFETY_ELEMENT__GID;

	/**
	 * The feature id for the '<em><b>Is Citation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAFETY_MECHANISM__IS_CITATION = COMPONENT_SAFETY_ELEMENT__IS_CITATION;

	/**
	 * The feature id for the '<em><b>Is Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAFETY_MECHANISM__IS_ABSTRACT = COMPONENT_SAFETY_ELEMENT__IS_ABSTRACT;

	/**
	 * The feature id for the '<em><b>Cited Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAFETY_MECHANISM__CITED_ELEMENT = COMPONENT_SAFETY_ELEMENT__CITED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Coordinate</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAFETY_MECHANISM__COORDINATE = COMPONENT_SAFETY_ELEMENT__COORDINATE;

	/**
	 * The feature id for the '<em><b>Dimension</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAFETY_MECHANISM__DIMENSION = COMPONENT_SAFETY_ELEMENT__DIMENSION;

	/**
	 * The feature id for the '<em><b>Heading</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAFETY_MECHANISM__HEADING = COMPONENT_SAFETY_ELEMENT__HEADING;

	/**
	 * The feature id for the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAFETY_MECHANISM__NAME = COMPONENT_SAFETY_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAFETY_MECHANISM__DESCRIPTION = COMPONENT_SAFETY_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Implementation Constraint</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAFETY_MECHANISM__IMPLEMENTATION_CONSTRAINT = COMPONENT_SAFETY_ELEMENT__IMPLEMENTATION_CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Note</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAFETY_MECHANISM__NOTE = COMPONENT_SAFETY_ELEMENT__NOTE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAFETY_MECHANISM__TAGGED_VALUE = COMPONENT_SAFETY_ELEMENT__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>External Reference</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAFETY_MECHANISM__EXTERNAL_REFERENCE = COMPONENT_SAFETY_ELEMENT__EXTERNAL_REFERENCE;

	/**
	 * The feature id for the '<em><b>Identity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAFETY_MECHANISM__IDENTITY = COMPONENT_SAFETY_ELEMENT__IDENTITY;

	/**
	 * The feature id for the '<em><b>Handle</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAFETY_MECHANISM__HANDLE = COMPONENT_SAFETY_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Mechanism</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAFETY_MECHANISM__MECHANISM = COMPONENT_SAFETY_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Coverage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAFETY_MECHANISM__COVERAGE = COMPONENT_SAFETY_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Costs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAFETY_MECHANISM__COSTS = COMPONENT_SAFETY_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Safety Mechanism</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAFETY_MECHANISM_FEATURE_COUNT = COMPONENT_SAFETY_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link component.impl.CostImpl <em>Cost</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see component.impl.CostImpl
	 * @see component.impl.Component_PackageImpl#getCost()
	 * @generated
	 */
	int COST = 23;

	/**
	 * The feature id for the '<em><b>Gid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COST__GID = COMPONENT_SAFETY_ELEMENT__GID;

	/**
	 * The feature id for the '<em><b>Is Citation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COST__IS_CITATION = COMPONENT_SAFETY_ELEMENT__IS_CITATION;

	/**
	 * The feature id for the '<em><b>Is Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COST__IS_ABSTRACT = COMPONENT_SAFETY_ELEMENT__IS_ABSTRACT;

	/**
	 * The feature id for the '<em><b>Cited Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COST__CITED_ELEMENT = COMPONENT_SAFETY_ELEMENT__CITED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Coordinate</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COST__COORDINATE = COMPONENT_SAFETY_ELEMENT__COORDINATE;

	/**
	 * The feature id for the '<em><b>Dimension</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COST__DIMENSION = COMPONENT_SAFETY_ELEMENT__DIMENSION;

	/**
	 * The feature id for the '<em><b>Heading</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COST__HEADING = COMPONENT_SAFETY_ELEMENT__HEADING;

	/**
	 * The feature id for the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COST__NAME = COMPONENT_SAFETY_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COST__DESCRIPTION = COMPONENT_SAFETY_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Implementation Constraint</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COST__IMPLEMENTATION_CONSTRAINT = COMPONENT_SAFETY_ELEMENT__IMPLEMENTATION_CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Note</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COST__NOTE = COMPONENT_SAFETY_ELEMENT__NOTE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COST__TAGGED_VALUE = COMPONENT_SAFETY_ELEMENT__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>External Reference</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COST__EXTERNAL_REFERENCE = COMPONENT_SAFETY_ELEMENT__EXTERNAL_REFERENCE;

	/**
	 * The feature id for the '<em><b>Identity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COST__IDENTITY = COMPONENT_SAFETY_ELEMENT__IDENTITY;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COST__UNIT = COMPONENT_SAFETY_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Cost</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COST__COST = COMPONENT_SAFETY_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Cost</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COST_FEATURE_COUNT = COMPONENT_SAFETY_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link component.impl.FailureEffectImpl <em>Failure Effect</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see component.impl.FailureEffectImpl
	 * @see component.impl.Component_PackageImpl#getFailureEffect()
	 * @generated
	 */
	int FAILURE_EFFECT = 24;

	/**
	 * The feature id for the '<em><b>Gid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAILURE_EFFECT__GID = COMPONENT_SAFETY_ELEMENT__GID;

	/**
	 * The feature id for the '<em><b>Is Citation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAILURE_EFFECT__IS_CITATION = COMPONENT_SAFETY_ELEMENT__IS_CITATION;

	/**
	 * The feature id for the '<em><b>Is Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAILURE_EFFECT__IS_ABSTRACT = COMPONENT_SAFETY_ELEMENT__IS_ABSTRACT;

	/**
	 * The feature id for the '<em><b>Cited Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAILURE_EFFECT__CITED_ELEMENT = COMPONENT_SAFETY_ELEMENT__CITED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Coordinate</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAILURE_EFFECT__COORDINATE = COMPONENT_SAFETY_ELEMENT__COORDINATE;

	/**
	 * The feature id for the '<em><b>Dimension</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAILURE_EFFECT__DIMENSION = COMPONENT_SAFETY_ELEMENT__DIMENSION;

	/**
	 * The feature id for the '<em><b>Heading</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAILURE_EFFECT__HEADING = COMPONENT_SAFETY_ELEMENT__HEADING;

	/**
	 * The feature id for the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAILURE_EFFECT__NAME = COMPONENT_SAFETY_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAILURE_EFFECT__DESCRIPTION = COMPONENT_SAFETY_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Implementation Constraint</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAILURE_EFFECT__IMPLEMENTATION_CONSTRAINT = COMPONENT_SAFETY_ELEMENT__IMPLEMENTATION_CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Note</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAILURE_EFFECT__NOTE = COMPONENT_SAFETY_ELEMENT__NOTE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAILURE_EFFECT__TAGGED_VALUE = COMPONENT_SAFETY_ELEMENT__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>External Reference</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAILURE_EFFECT__EXTERNAL_REFERENCE = COMPONENT_SAFETY_ELEMENT__EXTERNAL_REFERENCE;

	/**
	 * The feature id for the '<em><b>Identity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAILURE_EFFECT__IDENTITY = COMPONENT_SAFETY_ELEMENT__IDENTITY;

	/**
	 * The feature id for the '<em><b>Effect</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAILURE_EFFECT__EFFECT = COMPONENT_SAFETY_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Affected</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAILURE_EFFECT__AFFECTED = COMPONENT_SAFETY_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Failure Effect</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAILURE_EFFECT_FEATURE_COUNT = COMPONENT_SAFETY_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link component.impl.RegionalEffectImpl <em>Regional Effect</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see component.impl.RegionalEffectImpl
	 * @see component.impl.Component_PackageImpl#getRegionalEffect()
	 * @generated
	 */
	int REGIONAL_EFFECT = 25;

	/**
	 * The feature id for the '<em><b>Gid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGIONAL_EFFECT__GID = FAILURE_EFFECT__GID;

	/**
	 * The feature id for the '<em><b>Is Citation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGIONAL_EFFECT__IS_CITATION = FAILURE_EFFECT__IS_CITATION;

	/**
	 * The feature id for the '<em><b>Is Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGIONAL_EFFECT__IS_ABSTRACT = FAILURE_EFFECT__IS_ABSTRACT;

	/**
	 * The feature id for the '<em><b>Cited Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGIONAL_EFFECT__CITED_ELEMENT = FAILURE_EFFECT__CITED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Coordinate</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGIONAL_EFFECT__COORDINATE = FAILURE_EFFECT__COORDINATE;

	/**
	 * The feature id for the '<em><b>Dimension</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGIONAL_EFFECT__DIMENSION = FAILURE_EFFECT__DIMENSION;

	/**
	 * The feature id for the '<em><b>Heading</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGIONAL_EFFECT__HEADING = FAILURE_EFFECT__HEADING;

	/**
	 * The feature id for the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGIONAL_EFFECT__NAME = FAILURE_EFFECT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGIONAL_EFFECT__DESCRIPTION = FAILURE_EFFECT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Implementation Constraint</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGIONAL_EFFECT__IMPLEMENTATION_CONSTRAINT = FAILURE_EFFECT__IMPLEMENTATION_CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Note</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGIONAL_EFFECT__NOTE = FAILURE_EFFECT__NOTE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGIONAL_EFFECT__TAGGED_VALUE = FAILURE_EFFECT__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>External Reference</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGIONAL_EFFECT__EXTERNAL_REFERENCE = FAILURE_EFFECT__EXTERNAL_REFERENCE;

	/**
	 * The feature id for the '<em><b>Identity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGIONAL_EFFECT__IDENTITY = FAILURE_EFFECT__IDENTITY;

	/**
	 * The feature id for the '<em><b>Effect</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGIONAL_EFFECT__EFFECT = FAILURE_EFFECT__EFFECT;

	/**
	 * The feature id for the '<em><b>Affected</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGIONAL_EFFECT__AFFECTED = FAILURE_EFFECT__AFFECTED;

	/**
	 * The number of structural features of the '<em>Regional Effect</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGIONAL_EFFECT_FEATURE_COUNT = FAILURE_EFFECT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link component.impl.HigherLevelEffectImpl <em>Higher Level Effect</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see component.impl.HigherLevelEffectImpl
	 * @see component.impl.Component_PackageImpl#getHigherLevelEffect()
	 * @generated
	 */
	int HIGHER_LEVEL_EFFECT = 26;

	/**
	 * The feature id for the '<em><b>Gid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HIGHER_LEVEL_EFFECT__GID = FAILURE_EFFECT__GID;

	/**
	 * The feature id for the '<em><b>Is Citation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HIGHER_LEVEL_EFFECT__IS_CITATION = FAILURE_EFFECT__IS_CITATION;

	/**
	 * The feature id for the '<em><b>Is Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HIGHER_LEVEL_EFFECT__IS_ABSTRACT = FAILURE_EFFECT__IS_ABSTRACT;

	/**
	 * The feature id for the '<em><b>Cited Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HIGHER_LEVEL_EFFECT__CITED_ELEMENT = FAILURE_EFFECT__CITED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Coordinate</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HIGHER_LEVEL_EFFECT__COORDINATE = FAILURE_EFFECT__COORDINATE;

	/**
	 * The feature id for the '<em><b>Dimension</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HIGHER_LEVEL_EFFECT__DIMENSION = FAILURE_EFFECT__DIMENSION;

	/**
	 * The feature id for the '<em><b>Heading</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HIGHER_LEVEL_EFFECT__HEADING = FAILURE_EFFECT__HEADING;

	/**
	 * The feature id for the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HIGHER_LEVEL_EFFECT__NAME = FAILURE_EFFECT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HIGHER_LEVEL_EFFECT__DESCRIPTION = FAILURE_EFFECT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Implementation Constraint</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HIGHER_LEVEL_EFFECT__IMPLEMENTATION_CONSTRAINT = FAILURE_EFFECT__IMPLEMENTATION_CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Note</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HIGHER_LEVEL_EFFECT__NOTE = FAILURE_EFFECT__NOTE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HIGHER_LEVEL_EFFECT__TAGGED_VALUE = FAILURE_EFFECT__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>External Reference</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HIGHER_LEVEL_EFFECT__EXTERNAL_REFERENCE = FAILURE_EFFECT__EXTERNAL_REFERENCE;

	/**
	 * The feature id for the '<em><b>Identity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HIGHER_LEVEL_EFFECT__IDENTITY = FAILURE_EFFECT__IDENTITY;

	/**
	 * The feature id for the '<em><b>Effect</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HIGHER_LEVEL_EFFECT__EFFECT = FAILURE_EFFECT__EFFECT;

	/**
	 * The feature id for the '<em><b>Affected</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HIGHER_LEVEL_EFFECT__AFFECTED = FAILURE_EFFECT__AFFECTED;

	/**
	 * The number of structural features of the '<em>Higher Level Effect</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HIGHER_LEVEL_EFFECT_FEATURE_COUNT = FAILURE_EFFECT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link component.impl.FinalEffectImpl <em>Final Effect</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see component.impl.FinalEffectImpl
	 * @see component.impl.Component_PackageImpl#getFinalEffect()
	 * @generated
	 */
	int FINAL_EFFECT = 27;

	/**
	 * The feature id for the '<em><b>Gid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL_EFFECT__GID = FAILURE_EFFECT__GID;

	/**
	 * The feature id for the '<em><b>Is Citation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL_EFFECT__IS_CITATION = FAILURE_EFFECT__IS_CITATION;

	/**
	 * The feature id for the '<em><b>Is Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL_EFFECT__IS_ABSTRACT = FAILURE_EFFECT__IS_ABSTRACT;

	/**
	 * The feature id for the '<em><b>Cited Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL_EFFECT__CITED_ELEMENT = FAILURE_EFFECT__CITED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Coordinate</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL_EFFECT__COORDINATE = FAILURE_EFFECT__COORDINATE;

	/**
	 * The feature id for the '<em><b>Dimension</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL_EFFECT__DIMENSION = FAILURE_EFFECT__DIMENSION;

	/**
	 * The feature id for the '<em><b>Heading</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL_EFFECT__HEADING = FAILURE_EFFECT__HEADING;

	/**
	 * The feature id for the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL_EFFECT__NAME = FAILURE_EFFECT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL_EFFECT__DESCRIPTION = FAILURE_EFFECT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Implementation Constraint</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL_EFFECT__IMPLEMENTATION_CONSTRAINT = FAILURE_EFFECT__IMPLEMENTATION_CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Note</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL_EFFECT__NOTE = FAILURE_EFFECT__NOTE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL_EFFECT__TAGGED_VALUE = FAILURE_EFFECT__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>External Reference</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL_EFFECT__EXTERNAL_REFERENCE = FAILURE_EFFECT__EXTERNAL_REFERENCE;

	/**
	 * The feature id for the '<em><b>Identity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL_EFFECT__IDENTITY = FAILURE_EFFECT__IDENTITY;

	/**
	 * The feature id for the '<em><b>Effect</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL_EFFECT__EFFECT = FAILURE_EFFECT__EFFECT;

	/**
	 * The feature id for the '<em><b>Affected</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL_EFFECT__AFFECTED = FAILURE_EFFECT__AFFECTED;

	/**
	 * The number of structural features of the '<em>Final Effect</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL_EFFECT_FEATURE_COUNT = FAILURE_EFFECT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link component.FailureSeverity <em>Failure Severity</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see component.FailureSeverity
	 * @see component.impl.Component_PackageImpl#getFailureSeverity()
	 * @generated
	 */
	int FAILURE_SEVERITY = 28;

	/**
	 * The meta object id for the '{@link component.ComponentType <em>Component Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see component.ComponentType
	 * @see component.impl.Component_PackageImpl#getComponentType()
	 * @generated
	 */
	int COMPONENT_TYPE = 29;

	/**
	 * The meta object id for the '{@link component.ToleranceType <em>Tolerance Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see component.ToleranceType
	 * @see component.impl.Component_PackageImpl#getToleranceType()
	 * @generated
	 */
	int TOLERANCE_TYPE = 30;

	/**
	 * The meta object id for the '{@link component.FailureEffectEnum <em>Failure Effect Enum</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see component.FailureEffectEnum
	 * @see component.impl.Component_PackageImpl#getFailureEffectEnum()
	 * @generated
	 */
	int FAILURE_EFFECT_ENUM = 31;


	/**
	 * Returns the meta object for class '{@link component.ComponentElement <em>Component Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Component Element</em>'.
	 * @see component.ComponentElement
	 * @generated
	 */
	EClass getComponentElement();

	/**
	 * Returns the meta object for class '{@link component.ComponentPackage <em>Component Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Component Package</em>'.
	 * @see component.ComponentPackage
	 * @generated
	 */
	EClass getComponentPackage();

	/**
	 * Returns the meta object for the containment reference list '{@link component.ComponentPackage#getComponents <em>Components</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Components</em>'.
	 * @see component.ComponentPackage#getComponents()
	 * @see #getComponentPackage()
	 * @generated
	 */
	EReference getComponentPackage_Components();

	/**
	 * Returns the meta object for the reference list '{@link component.ComponentPackage#getInterface <em>Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Interface</em>'.
	 * @see component.ComponentPackage#getInterface()
	 * @see #getComponentPackage()
	 * @generated
	 */
	EReference getComponentPackage_Interface();

	/**
	 * Returns the meta object for class '{@link component.ComponentPackageInterface <em>Component Package Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Component Package Interface</em>'.
	 * @see component.ComponentPackageInterface
	 * @generated
	 */
	EClass getComponentPackageInterface();

	/**
	 * Returns the meta object for the reference '{@link component.ComponentPackageInterface#getImplements <em>Implements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Implements</em>'.
	 * @see component.ComponentPackageInterface#getImplements()
	 * @see #getComponentPackageInterface()
	 * @generated
	 */
	EReference getComponentPackageInterface_Implements();

	/**
	 * Returns the meta object for class '{@link component.ComponentPackageBinding <em>Component Package Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Component Package Binding</em>'.
	 * @see component.ComponentPackageBinding
	 * @generated
	 */
	EClass getComponentPackageBinding();

	/**
	 * Returns the meta object for the reference list '{@link component.ComponentPackageBinding#getParticipantPackage <em>Participant Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Participant Package</em>'.
	 * @see component.ComponentPackageBinding#getParticipantPackage()
	 * @see #getComponentPackageBinding()
	 * @generated
	 */
	EReference getComponentPackageBinding_ParticipantPackage();

	/**
	 * Returns the meta object for class '{@link component.Component <em>Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Component</em>'.
	 * @see component.Component
	 * @generated
	 */
	EClass getComponent();

	/**
	 * Returns the meta object for the attribute '{@link component.Component#isDynamic <em>Dynamic</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dynamic</em>'.
	 * @see component.Component#isDynamic()
	 * @see #getComponent()
	 * @generated
	 */
	EAttribute getComponent_Dynamic();

	/**
	 * Returns the meta object for the attribute '{@link component.Component#getIdentity <em>Identity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Identity</em>'.
	 * @see component.Component#getIdentity()
	 * @see #getComponent()
	 * @generated
	 */
	EAttribute getComponent_Identity();

	/**
	 * Returns the meta object for the attribute '{@link component.Component#getComponent_name <em>Component name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Component name</em>'.
	 * @see component.Component#getComponent_name()
	 * @see #getComponent()
	 * @generated
	 */
	EAttribute getComponent_Component_name();

	/**
	 * Returns the meta object for the attribute '{@link component.Component#getReuse <em>Reuse</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Reuse</em>'.
	 * @see component.Component#getReuse()
	 * @see #getComponent()
	 * @generated
	 */
	EAttribute getComponent_Reuse();

	/**
	 * Returns the meta object for the attribute '{@link component.Component#getCots <em>Cots</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cots</em>'.
	 * @see component.Component#getCots()
	 * @see #getComponent()
	 * @generated
	 */
	EAttribute getComponent_Cots();

	/**
	 * Returns the meta object for the attribute '{@link component.Component#getFit <em>Fit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fit</em>'.
	 * @see component.Component#getFit()
	 * @see #getComponent()
	 * @generated
	 */
	EAttribute getComponent_Fit();

	/**
	 * Returns the meta object for the attribute '{@link component.Component#isSafety_related <em>Safety related</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Safety related</em>'.
	 * @see component.Component#isSafety_related()
	 * @see #getComponent()
	 * @generated
	 */
	EAttribute getComponent_Safety_related();

	/**
	 * Returns the meta object for the attribute '{@link component.Component#getSil <em>Sil</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sil</em>'.
	 * @see component.Component#getSil()
	 * @see #getComponent()
	 * @generated
	 */
	EAttribute getComponent_Sil();

	/**
	 * Returns the meta object for the containment reference list '{@link component.Component#getReadings <em>Readings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Readings</em>'.
	 * @see component.Component#getReadings()
	 * @see #getComponent()
	 * @generated
	 */
	EReference getComponent_Readings();

	/**
	 * Returns the meta object for the reference '{@link component.Component#getBlockType <em>Block Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Block Type</em>'.
	 * @see component.Component#getBlockType()
	 * @see #getComponent()
	 * @generated
	 */
	EReference getComponent_BlockType();

	/**
	 * Returns the meta object for the reference '{@link component.Component#getFunction <em>Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Function</em>'.
	 * @see component.Component#getFunction()
	 * @see #getComponent()
	 * @generated
	 */
	EReference getComponent_Function();

	/**
	 * Returns the meta object for the attribute '{@link component.Component#getComponentType <em>Component Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Component Type</em>'.
	 * @see component.Component#getComponentType()
	 * @see #getComponent()
	 * @generated
	 */
	EAttribute getComponent_ComponentType();

	/**
	 * Returns the meta object for the containment reference list '{@link component.Component#getInputs <em>Inputs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Inputs</em>'.
	 * @see component.Component#getInputs()
	 * @see #getComponent()
	 * @generated
	 */
	EReference getComponent_Inputs();

	/**
	 * Returns the meta object for the containment reference list '{@link component.Component#getOutputs <em>Outputs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Outputs</em>'.
	 * @see component.Component#getOutputs()
	 * @see #getComponent()
	 * @generated
	 */
	EReference getComponent_Outputs();

	/**
	 * Returns the meta object for the containment reference list '{@link component.Component#getLports <em>Lports</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Lports</em>'.
	 * @see component.Component#getLports()
	 * @see #getComponent()
	 * @generated
	 */
	EReference getComponent_Lports();

	/**
	 * Returns the meta object for the containment reference list '{@link component.Component#getRports <em>Rports</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Rports</em>'.
	 * @see component.Component#getRports()
	 * @see #getComponent()
	 * @generated
	 */
	EReference getComponent_Rports();

	/**
	 * Returns the meta object for the containment reference list '{@link component.Component#getSub_components <em>Sub components</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sub components</em>'.
	 * @see component.Component#getSub_components()
	 * @see #getComponent()
	 * @generated
	 */
	EReference getComponent_Sub_components();

	/**
	 * Returns the meta object for the containment reference list '{@link component.Component#getFailure_modes <em>Failure modes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Failure modes</em>'.
	 * @see component.Component#getFailure_modes()
	 * @see #getComponent()
	 * @generated
	 */
	EReference getComponent_Failure_modes();

	/**
	 * Returns the meta object for the containment reference list '{@link component.Component#getSafety_mechanisms <em>Safety mechanisms</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Safety mechanisms</em>'.
	 * @see component.Component#getSafety_mechanisms()
	 * @see #getComponent()
	 * @generated
	 */
	EReference getComponent_Safety_mechanisms();

	/**
	 * Returns the meta object for the reference list '{@link component.Component#getRequirements <em>Requirements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Requirements</em>'.
	 * @see component.Component#getRequirements()
	 * @see #getComponent()
	 * @generated
	 */
	EReference getComponent_Requirements();

	/**
	 * Returns the meta object for the containment reference '{@link component.Component#getReading <em>Reading</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Reading</em>'.
	 * @see component.Component#getReading()
	 * @see #getComponent()
	 * @generated
	 */
	EReference getComponent_Reading();

	/**
	 * Returns the meta object for the attribute '{@link component.Component#isFaulty <em>Faulty</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Faulty</em>'.
	 * @see component.Component#isFaulty()
	 * @see #getComponent()
	 * @generated
	 */
	EAttribute getComponent_Faulty();

	/**
	 * Returns the meta object for the attribute '{@link component.Component#isRunningNormally <em>Running Normally</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Running Normally</em>'.
	 * @see component.Component#isRunningNormally()
	 * @see #getComponent()
	 * @generated
	 */
	EAttribute getComponent_RunningNormally();

	/**
	 * Returns the meta object for the attribute '{@link component.Component#isRunningAbnormally <em>Running Abnormally</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Running Abnormally</em>'.
	 * @see component.Component#isRunningAbnormally()
	 * @see #getComponent()
	 * @generated
	 */
	EAttribute getComponent_RunningAbnormally();

	/**
	 * Returns the meta object for the attribute '{@link component.Component#isToBePredicted <em>To Be Predicted</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>To Be Predicted</em>'.
	 * @see component.Component#isToBePredicted()
	 * @see #getComponent()
	 * @generated
	 */
	EAttribute getComponent_ToBePredicted();

	/**
	 * Returns the meta object for class '{@link component.ComponentRelationship <em>Component Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Component Relationship</em>'.
	 * @see component.ComponentRelationship
	 * @generated
	 */
	EClass getComponentRelationship();

	/**
	 * Returns the meta object for the attribute '{@link component.ComponentRelationship#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label</em>'.
	 * @see component.ComponentRelationship#getLabel()
	 * @see #getComponentRelationship()
	 * @generated
	 */
	EAttribute getComponentRelationship_Label();

	/**
	 * Returns the meta object for class '{@link component.DirectedRelationship <em>Directed Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Directed Relationship</em>'.
	 * @see component.DirectedRelationship
	 * @generated
	 */
	EClass getDirectedRelationship();

	/**
	 * Returns the meta object for the reference '{@link component.DirectedRelationship#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see component.DirectedRelationship#getSource()
	 * @see #getDirectedRelationship()
	 * @generated
	 */
	EReference getDirectedRelationship_Source();

	/**
	 * Returns the meta object for the reference '{@link component.DirectedRelationship#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see component.DirectedRelationship#getTarget()
	 * @see #getDirectedRelationship()
	 * @generated
	 */
	EReference getDirectedRelationship_Target();

	/**
	 * Returns the meta object for the attribute '{@link component.DirectedRelationship#isFaulty <em>Faulty</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Faulty</em>'.
	 * @see component.DirectedRelationship#isFaulty()
	 * @see #getDirectedRelationship()
	 * @generated
	 */
	EAttribute getDirectedRelationship_Faulty();

	/**
	 * Returns the meta object for the attribute '{@link component.DirectedRelationship#isRunningNormally <em>Running Normally</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Running Normally</em>'.
	 * @see component.DirectedRelationship#isRunningNormally()
	 * @see #getDirectedRelationship()
	 * @generated
	 */
	EAttribute getDirectedRelationship_RunningNormally();

	/**
	 * Returns the meta object for the attribute '{@link component.DirectedRelationship#isRunningAbnormally <em>Running Abnormally</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Running Abnormally</em>'.
	 * @see component.DirectedRelationship#isRunningAbnormally()
	 * @see #getDirectedRelationship()
	 * @generated
	 */
	EAttribute getDirectedRelationship_RunningAbnormally();

	/**
	 * Returns the meta object for the attribute '{@link component.DirectedRelationship#isToBePredicted <em>To Be Predicted</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>To Be Predicted</em>'.
	 * @see component.DirectedRelationship#isToBePredicted()
	 * @see #getDirectedRelationship()
	 * @generated
	 */
	EAttribute getDirectedRelationship_ToBePredicted();

	/**
	 * Returns the meta object for class '{@link component.UndirectedRelationship <em>Undirected Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Undirected Relationship</em>'.
	 * @see component.UndirectedRelationship
	 * @generated
	 */
	EClass getUndirectedRelationship();

	/**
	 * Returns the meta object for the reference '{@link component.UndirectedRelationship#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see component.UndirectedRelationship#getSource()
	 * @see #getUndirectedRelationship()
	 * @generated
	 */
	EReference getUndirectedRelationship_Source();

	/**
	 * Returns the meta object for the reference '{@link component.UndirectedRelationship#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see component.UndirectedRelationship#getTarget()
	 * @see #getUndirectedRelationship()
	 * @generated
	 */
	EReference getUndirectedRelationship_Target();

	/**
	 * Returns the meta object for class '{@link component.ComponentAsset <em>Component Asset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Component Asset</em>'.
	 * @see component.ComponentAsset
	 * @generated
	 */
	EClass getComponentAsset();

	/**
	 * Returns the meta object for class '{@link component.UtilityNodes <em>Utility Nodes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Utility Nodes</em>'.
	 * @see component.UtilityNodes
	 * @generated
	 */
	EClass getUtilityNodes();

	/**
	 * Returns the meta object for the containment reference '{@link component.UtilityNodes#getReading <em>Reading</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Reading</em>'.
	 * @see component.UtilityNodes#getReading()
	 * @see #getUtilityNodes()
	 * @generated
	 */
	EReference getUtilityNodes_Reading();

	/**
	 * Returns the meta object for class '{@link component.TransitionNode <em>Transition Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transition Node</em>'.
	 * @see component.TransitionNode
	 * @generated
	 */
	EClass getTransitionNode();

	/**
	 * Returns the meta object for class '{@link component.Fork <em>Fork</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fork</em>'.
	 * @see component.Fork
	 * @generated
	 */
	EClass getFork();

	/**
	 * Returns the meta object for the reference '{@link component.Fork#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see component.Fork#getSource()
	 * @see #getFork()
	 * @generated
	 */
	EReference getFork_Source();

	/**
	 * Returns the meta object for the reference list '{@link component.Fork#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Target</em>'.
	 * @see component.Fork#getTarget()
	 * @see #getFork()
	 * @generated
	 */
	EReference getFork_Target();

	/**
	 * Returns the meta object for class '{@link component.Switch <em>Switch</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Switch</em>'.
	 * @see component.Switch
	 * @generated
	 */
	EClass getSwitch();

	/**
	 * Returns the meta object for the reference list '{@link component.Switch#getPorts <em>Ports</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Ports</em>'.
	 * @see component.Switch#getPorts()
	 * @see #getSwitch()
	 * @generated
	 */
	EReference getSwitch_Ports();

	/**
	 * Returns the meta object for class '{@link component.IONode <em>IO Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IO Node</em>'.
	 * @see component.IONode
	 * @generated
	 */
	EClass getIONode();

	/**
	 * Returns the meta object for the attribute '{@link component.IONode#getUpper <em>Upper</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Upper</em>'.
	 * @see component.IONode#getUpper()
	 * @see #getIONode()
	 * @generated
	 */
	EAttribute getIONode_Upper();

	/**
	 * Returns the meta object for the attribute '{@link component.IONode#getLower <em>Lower</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lower</em>'.
	 * @see component.IONode#getLower()
	 * @see #getIONode()
	 * @generated
	 */
	EAttribute getIONode_Lower();

	/**
	 * Returns the meta object for class '{@link component.Input <em>Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Input</em>'.
	 * @see component.Input
	 * @generated
	 */
	EClass getInput();

	/**
	 * Returns the meta object for the attribute '{@link component.Input#isFaulty <em>Faulty</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Faulty</em>'.
	 * @see component.Input#isFaulty()
	 * @see #getInput()
	 * @generated
	 */
	EAttribute getInput_Faulty();

	/**
	 * Returns the meta object for the attribute '{@link component.Input#isRunningNormally <em>Running Normally</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Running Normally</em>'.
	 * @see component.Input#isRunningNormally()
	 * @see #getInput()
	 * @generated
	 */
	EAttribute getInput_RunningNormally();

	/**
	 * Returns the meta object for the attribute '{@link component.Input#isRunningAbnormally <em>Running Abnormally</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Running Abnormally</em>'.
	 * @see component.Input#isRunningAbnormally()
	 * @see #getInput()
	 * @generated
	 */
	EAttribute getInput_RunningAbnormally();

	/**
	 * Returns the meta object for the attribute '{@link component.Input#isToBePredicted <em>To Be Predicted</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>To Be Predicted</em>'.
	 * @see component.Input#isToBePredicted()
	 * @see #getInput()
	 * @generated
	 */
	EAttribute getInput_ToBePredicted();

	/**
	 * Returns the meta object for class '{@link component.Output <em>Output</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Output</em>'.
	 * @see component.Output
	 * @generated
	 */
	EClass getOutput();

	/**
	 * Returns the meta object for the attribute '{@link component.Output#isFaulty <em>Faulty</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Faulty</em>'.
	 * @see component.Output#isFaulty()
	 * @see #getOutput()
	 * @generated
	 */
	EAttribute getOutput_Faulty();

	/**
	 * Returns the meta object for the attribute '{@link component.Output#isRunningNormally <em>Running Normally</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Running Normally</em>'.
	 * @see component.Output#isRunningNormally()
	 * @see #getOutput()
	 * @generated
	 */
	EAttribute getOutput_RunningNormally();

	/**
	 * Returns the meta object for the attribute '{@link component.Output#isRunningAbnormally <em>Running Abnormally</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Running Abnormally</em>'.
	 * @see component.Output#isRunningAbnormally()
	 * @see #getOutput()
	 * @generated
	 */
	EAttribute getOutput_RunningAbnormally();

	/**
	 * Returns the meta object for the attribute '{@link component.Output#isToBePredicted <em>To Be Predicted</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>To Be Predicted</em>'.
	 * @see component.Output#isToBePredicted()
	 * @see #getOutput()
	 * @generated
	 */
	EAttribute getOutput_ToBePredicted();

	/**
	 * Returns the meta object for class '{@link component.LPort <em>LPort</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>LPort</em>'.
	 * @see component.LPort
	 * @generated
	 */
	EClass getLPort();

	/**
	 * Returns the meta object for class '{@link component.RPort <em>RPort</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>RPort</em>'.
	 * @see component.RPort
	 * @generated
	 */
	EClass getRPort();

	/**
	 * Returns the meta object for class '{@link component.Function <em>Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Function</em>'.
	 * @see component.Function
	 * @generated
	 */
	EClass getFunction();

	/**
	 * Returns the meta object for the attribute '{@link component.Function#getFunc <em>Func</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Func</em>'.
	 * @see component.Function#getFunc()
	 * @see #getFunction()
	 * @generated
	 */
	EAttribute getFunction_Func();

	/**
	 * Returns the meta object for the attribute '{@link component.Function#getToleranceType <em>Tolerance Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tolerance Type</em>'.
	 * @see component.Function#getToleranceType()
	 * @see #getFunction()
	 * @generated
	 */
	EAttribute getFunction_ToleranceType();

	/**
	 * Returns the meta object for class '{@link component.Reading <em>Reading</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Reading</em>'.
	 * @see component.Reading
	 * @generated
	 */
	EClass getReading();

	/**
	 * Returns the meta object for the attribute '{@link component.Reading#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see component.Reading#getValue()
	 * @see #getReading()
	 * @generated
	 */
	EAttribute getReading_Value();

	/**
	 * Returns the meta object for the attribute '{@link component.Reading#getUpper_value <em>Upper value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Upper value</em>'.
	 * @see component.Reading#getUpper_value()
	 * @see #getReading()
	 * @generated
	 */
	EAttribute getReading_Upper_value();

	/**
	 * Returns the meta object for the attribute '{@link component.Reading#getLower_value <em>Lower value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lower value</em>'.
	 * @see component.Reading#getLower_value()
	 * @see #getReading()
	 * @generated
	 */
	EAttribute getReading_Lower_value();

	/**
	 * Returns the meta object for the attribute '{@link component.Reading#getUnit <em>Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unit</em>'.
	 * @see component.Reading#getUnit()
	 * @see #getReading()
	 * @generated
	 */
	EAttribute getReading_Unit();

	/**
	 * Returns the meta object for class '{@link component.ComponentSafetyElement <em>Component Safety Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Component Safety Element</em>'.
	 * @see component.ComponentSafetyElement
	 * @generated
	 */
	EClass getComponentSafetyElement();

	/**
	 * Returns the meta object for the attribute '{@link component.ComponentSafetyElement#getIdentity <em>Identity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Identity</em>'.
	 * @see component.ComponentSafetyElement#getIdentity()
	 * @see #getComponentSafetyElement()
	 * @generated
	 */
	EAttribute getComponentSafetyElement_Identity();

	/**
	 * Returns the meta object for class '{@link component.FailureMode <em>Failure Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Failure Mode</em>'.
	 * @see component.FailureMode
	 * @generated
	 */
	EClass getFailureMode();

	/**
	 * Returns the meta object for the attribute '{@link component.FailureMode#getMode <em>Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mode</em>'.
	 * @see component.FailureMode#getMode()
	 * @see #getFailureMode()
	 * @generated
	 */
	EAttribute getFailureMode_Mode();

	/**
	 * Returns the meta object for the attribute '{@link component.FailureMode#getCause <em>Cause</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cause</em>'.
	 * @see component.FailureMode#getCause()
	 * @see #getFailureMode()
	 * @generated
	 */
	EAttribute getFailureMode_Cause();

	/**
	 * Returns the meta object for the attribute '{@link component.FailureMode#getProbability <em>Probability</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Probability</em>'.
	 * @see component.FailureMode#getProbability()
	 * @see #getFailureMode()
	 * @generated
	 */
	EAttribute getFailureMode_Probability();

	/**
	 * Returns the meta object for the attribute '{@link component.FailureMode#isSafety_related <em>Safety related</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Safety related</em>'.
	 * @see component.FailureMode#isSafety_related()
	 * @see #getFailureMode()
	 * @generated
	 */
	EAttribute getFailureMode_Safety_related();

	/**
	 * Returns the meta object for the attribute '{@link component.FailureMode#getFailureSeverity <em>Failure Severity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Failure Severity</em>'.
	 * @see component.FailureMode#getFailureSeverity()
	 * @see #getFailureMode()
	 * @generated
	 */
	EAttribute getFailureMode_FailureSeverity();

	/**
	 * Returns the meta object for the reference list '{@link component.FailureMode#getHazards <em>Hazards</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Hazards</em>'.
	 * @see component.FailureMode#getHazards()
	 * @see #getFailureMode()
	 * @generated
	 */
	EReference getFailureMode_Hazards();

	/**
	 * Returns the meta object for the containment reference '{@link component.FailureMode#getRegional <em>Regional</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Regional</em>'.
	 * @see component.FailureMode#getRegional()
	 * @see #getFailureMode()
	 * @generated
	 */
	EReference getFailureMode_Regional();

	/**
	 * Returns the meta object for the containment reference '{@link component.FailureMode#getHigher_level <em>Higher level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Higher level</em>'.
	 * @see component.FailureMode#getHigher_level()
	 * @see #getFailureMode()
	 * @generated
	 */
	EReference getFailureMode_Higher_level();

	/**
	 * Returns the meta object for the containment reference '{@link component.FailureMode#getFinal <em>Final</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Final</em>'.
	 * @see component.FailureMode#getFinal()
	 * @see #getFailureMode()
	 * @generated
	 */
	EReference getFailureMode_Final();

	/**
	 * Returns the meta object for class '{@link component.SafetyMechanism <em>Safety Mechanism</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Safety Mechanism</em>'.
	 * @see component.SafetyMechanism
	 * @generated
	 */
	EClass getSafetyMechanism();

	/**
	 * Returns the meta object for the reference '{@link component.SafetyMechanism#getHandle <em>Handle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Handle</em>'.
	 * @see component.SafetyMechanism#getHandle()
	 * @see #getSafetyMechanism()
	 * @generated
	 */
	EReference getSafetyMechanism_Handle();

	/**
	 * Returns the meta object for the attribute '{@link component.SafetyMechanism#getMechanism <em>Mechanism</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mechanism</em>'.
	 * @see component.SafetyMechanism#getMechanism()
	 * @see #getSafetyMechanism()
	 * @generated
	 */
	EAttribute getSafetyMechanism_Mechanism();

	/**
	 * Returns the meta object for the attribute '{@link component.SafetyMechanism#getCoverage <em>Coverage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Coverage</em>'.
	 * @see component.SafetyMechanism#getCoverage()
	 * @see #getSafetyMechanism()
	 * @generated
	 */
	EAttribute getSafetyMechanism_Coverage();

	/**
	 * Returns the meta object for the containment reference list '{@link component.SafetyMechanism#getCosts <em>Costs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Costs</em>'.
	 * @see component.SafetyMechanism#getCosts()
	 * @see #getSafetyMechanism()
	 * @generated
	 */
	EReference getSafetyMechanism_Costs();

	/**
	 * Returns the meta object for class '{@link component.Cost <em>Cost</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cost</em>'.
	 * @see component.Cost
	 * @generated
	 */
	EClass getCost();

	/**
	 * Returns the meta object for the attribute '{@link component.Cost#getUnit <em>Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unit</em>'.
	 * @see component.Cost#getUnit()
	 * @see #getCost()
	 * @generated
	 */
	EAttribute getCost_Unit();

	/**
	 * Returns the meta object for the attribute '{@link component.Cost#getCost <em>Cost</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cost</em>'.
	 * @see component.Cost#getCost()
	 * @see #getCost()
	 * @generated
	 */
	EAttribute getCost_Cost();

	/**
	 * Returns the meta object for class '{@link component.FailureEffect <em>Failure Effect</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Failure Effect</em>'.
	 * @see component.FailureEffect
	 * @generated
	 */
	EClass getFailureEffect();

	/**
	 * Returns the meta object for the attribute '{@link component.FailureEffect#getEffect <em>Effect</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Effect</em>'.
	 * @see component.FailureEffect#getEffect()
	 * @see #getFailureEffect()
	 * @generated
	 */
	EAttribute getFailureEffect_Effect();

	/**
	 * Returns the meta object for the reference list '{@link component.FailureEffect#getAffected <em>Affected</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Affected</em>'.
	 * @see component.FailureEffect#getAffected()
	 * @see #getFailureEffect()
	 * @generated
	 */
	EReference getFailureEffect_Affected();

	/**
	 * Returns the meta object for class '{@link component.RegionalEffect <em>Regional Effect</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Regional Effect</em>'.
	 * @see component.RegionalEffect
	 * @generated
	 */
	EClass getRegionalEffect();

	/**
	 * Returns the meta object for class '{@link component.HigherLevelEffect <em>Higher Level Effect</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Higher Level Effect</em>'.
	 * @see component.HigherLevelEffect
	 * @generated
	 */
	EClass getHigherLevelEffect();

	/**
	 * Returns the meta object for class '{@link component.FinalEffect <em>Final Effect</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Final Effect</em>'.
	 * @see component.FinalEffect
	 * @generated
	 */
	EClass getFinalEffect();

	/**
	 * Returns the meta object for enum '{@link component.FailureSeverity <em>Failure Severity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Failure Severity</em>'.
	 * @see component.FailureSeverity
	 * @generated
	 */
	EEnum getFailureSeverity();

	/**
	 * Returns the meta object for enum '{@link component.ComponentType <em>Component Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Component Type</em>'.
	 * @see component.ComponentType
	 * @generated
	 */
	EEnum getComponentType();

	/**
	 * Returns the meta object for enum '{@link component.ToleranceType <em>Tolerance Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Tolerance Type</em>'.
	 * @see component.ToleranceType
	 * @generated
	 */
	EEnum getToleranceType();

	/**
	 * Returns the meta object for enum '{@link component.FailureEffectEnum <em>Failure Effect Enum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Failure Effect Enum</em>'.
	 * @see component.FailureEffectEnum
	 * @generated
	 */
	EEnum getFailureEffectEnum();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	Component_Factory getComponent_Factory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link component.impl.ComponentElementImpl <em>Component Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see component.impl.ComponentElementImpl
		 * @see component.impl.Component_PackageImpl#getComponentElement()
		 * @generated
		 */
		EClass COMPONENT_ELEMENT = eINSTANCE.getComponentElement();

		/**
		 * The meta object literal for the '{@link component.impl.ComponentPackageImpl <em>Component Package</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see component.impl.ComponentPackageImpl
		 * @see component.impl.Component_PackageImpl#getComponentPackage()
		 * @generated
		 */
		EClass COMPONENT_PACKAGE = eINSTANCE.getComponentPackage();

		/**
		 * The meta object literal for the '<em><b>Components</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT_PACKAGE__COMPONENTS = eINSTANCE.getComponentPackage_Components();

		/**
		 * The meta object literal for the '<em><b>Interface</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT_PACKAGE__INTERFACE = eINSTANCE.getComponentPackage_Interface();

		/**
		 * The meta object literal for the '{@link component.impl.ComponentPackageInterfaceImpl <em>Component Package Interface</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see component.impl.ComponentPackageInterfaceImpl
		 * @see component.impl.Component_PackageImpl#getComponentPackageInterface()
		 * @generated
		 */
		EClass COMPONENT_PACKAGE_INTERFACE = eINSTANCE.getComponentPackageInterface();

		/**
		 * The meta object literal for the '<em><b>Implements</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT_PACKAGE_INTERFACE__IMPLEMENTS = eINSTANCE.getComponentPackageInterface_Implements();

		/**
		 * The meta object literal for the '{@link component.impl.ComponentPackageBindingImpl <em>Component Package Binding</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see component.impl.ComponentPackageBindingImpl
		 * @see component.impl.Component_PackageImpl#getComponentPackageBinding()
		 * @generated
		 */
		EClass COMPONENT_PACKAGE_BINDING = eINSTANCE.getComponentPackageBinding();

		/**
		 * The meta object literal for the '<em><b>Participant Package</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT_PACKAGE_BINDING__PARTICIPANT_PACKAGE = eINSTANCE.getComponentPackageBinding_ParticipantPackage();

		/**
		 * The meta object literal for the '{@link component.impl.ComponentImpl <em>Component</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see component.impl.ComponentImpl
		 * @see component.impl.Component_PackageImpl#getComponent()
		 * @generated
		 */
		EClass COMPONENT = eINSTANCE.getComponent();

		/**
		 * The meta object literal for the '<em><b>Dynamic</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPONENT__DYNAMIC = eINSTANCE.getComponent_Dynamic();

		/**
		 * The meta object literal for the '<em><b>Identity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPONENT__IDENTITY = eINSTANCE.getComponent_Identity();

		/**
		 * The meta object literal for the '<em><b>Component name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPONENT__COMPONENT_NAME = eINSTANCE.getComponent_Component_name();

		/**
		 * The meta object literal for the '<em><b>Reuse</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPONENT__REUSE = eINSTANCE.getComponent_Reuse();

		/**
		 * The meta object literal for the '<em><b>Cots</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPONENT__COTS = eINSTANCE.getComponent_Cots();

		/**
		 * The meta object literal for the '<em><b>Fit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPONENT__FIT = eINSTANCE.getComponent_Fit();

		/**
		 * The meta object literal for the '<em><b>Safety related</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPONENT__SAFETY_RELATED = eINSTANCE.getComponent_Safety_related();

		/**
		 * The meta object literal for the '<em><b>Sil</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPONENT__SIL = eINSTANCE.getComponent_Sil();

		/**
		 * The meta object literal for the '<em><b>Readings</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT__READINGS = eINSTANCE.getComponent_Readings();

		/**
		 * The meta object literal for the '<em><b>Block Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT__BLOCK_TYPE = eINSTANCE.getComponent_BlockType();

		/**
		 * The meta object literal for the '<em><b>Function</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT__FUNCTION = eINSTANCE.getComponent_Function();

		/**
		 * The meta object literal for the '<em><b>Component Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPONENT__COMPONENT_TYPE = eINSTANCE.getComponent_ComponentType();

		/**
		 * The meta object literal for the '<em><b>Inputs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT__INPUTS = eINSTANCE.getComponent_Inputs();

		/**
		 * The meta object literal for the '<em><b>Outputs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT__OUTPUTS = eINSTANCE.getComponent_Outputs();

		/**
		 * The meta object literal for the '<em><b>Lports</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT__LPORTS = eINSTANCE.getComponent_Lports();

		/**
		 * The meta object literal for the '<em><b>Rports</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT__RPORTS = eINSTANCE.getComponent_Rports();

		/**
		 * The meta object literal for the '<em><b>Sub components</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT__SUB_COMPONENTS = eINSTANCE.getComponent_Sub_components();

		/**
		 * The meta object literal for the '<em><b>Failure modes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT__FAILURE_MODES = eINSTANCE.getComponent_Failure_modes();

		/**
		 * The meta object literal for the '<em><b>Safety mechanisms</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT__SAFETY_MECHANISMS = eINSTANCE.getComponent_Safety_mechanisms();

		/**
		 * The meta object literal for the '<em><b>Requirements</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT__REQUIREMENTS = eINSTANCE.getComponent_Requirements();

		/**
		 * The meta object literal for the '<em><b>Reading</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT__READING = eINSTANCE.getComponent_Reading();

		/**
		 * The meta object literal for the '<em><b>Faulty</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPONENT__FAULTY = eINSTANCE.getComponent_Faulty();

		/**
		 * The meta object literal for the '<em><b>Running Normally</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPONENT__RUNNING_NORMALLY = eINSTANCE.getComponent_RunningNormally();

		/**
		 * The meta object literal for the '<em><b>Running Abnormally</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPONENT__RUNNING_ABNORMALLY = eINSTANCE.getComponent_RunningAbnormally();

		/**
		 * The meta object literal for the '<em><b>To Be Predicted</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPONENT__TO_BE_PREDICTED = eINSTANCE.getComponent_ToBePredicted();

		/**
		 * The meta object literal for the '{@link component.impl.ComponentRelationshipImpl <em>Component Relationship</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see component.impl.ComponentRelationshipImpl
		 * @see component.impl.Component_PackageImpl#getComponentRelationship()
		 * @generated
		 */
		EClass COMPONENT_RELATIONSHIP = eINSTANCE.getComponentRelationship();

		/**
		 * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPONENT_RELATIONSHIP__LABEL = eINSTANCE.getComponentRelationship_Label();

		/**
		 * The meta object literal for the '{@link component.impl.DirectedRelationshipImpl <em>Directed Relationship</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see component.impl.DirectedRelationshipImpl
		 * @see component.impl.Component_PackageImpl#getDirectedRelationship()
		 * @generated
		 */
		EClass DIRECTED_RELATIONSHIP = eINSTANCE.getDirectedRelationship();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIRECTED_RELATIONSHIP__SOURCE = eINSTANCE.getDirectedRelationship_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIRECTED_RELATIONSHIP__TARGET = eINSTANCE.getDirectedRelationship_Target();

		/**
		 * The meta object literal for the '<em><b>Faulty</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIRECTED_RELATIONSHIP__FAULTY = eINSTANCE.getDirectedRelationship_Faulty();

		/**
		 * The meta object literal for the '<em><b>Running Normally</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIRECTED_RELATIONSHIP__RUNNING_NORMALLY = eINSTANCE.getDirectedRelationship_RunningNormally();

		/**
		 * The meta object literal for the '<em><b>Running Abnormally</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIRECTED_RELATIONSHIP__RUNNING_ABNORMALLY = eINSTANCE.getDirectedRelationship_RunningAbnormally();

		/**
		 * The meta object literal for the '<em><b>To Be Predicted</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIRECTED_RELATIONSHIP__TO_BE_PREDICTED = eINSTANCE.getDirectedRelationship_ToBePredicted();

		/**
		 * The meta object literal for the '{@link component.impl.UndirectedRelationshipImpl <em>Undirected Relationship</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see component.impl.UndirectedRelationshipImpl
		 * @see component.impl.Component_PackageImpl#getUndirectedRelationship()
		 * @generated
		 */
		EClass UNDIRECTED_RELATIONSHIP = eINSTANCE.getUndirectedRelationship();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UNDIRECTED_RELATIONSHIP__SOURCE = eINSTANCE.getUndirectedRelationship_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UNDIRECTED_RELATIONSHIP__TARGET = eINSTANCE.getUndirectedRelationship_Target();

		/**
		 * The meta object literal for the '{@link component.impl.ComponentAssetImpl <em>Component Asset</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see component.impl.ComponentAssetImpl
		 * @see component.impl.Component_PackageImpl#getComponentAsset()
		 * @generated
		 */
		EClass COMPONENT_ASSET = eINSTANCE.getComponentAsset();

		/**
		 * The meta object literal for the '{@link component.impl.UtilityNodesImpl <em>Utility Nodes</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see component.impl.UtilityNodesImpl
		 * @see component.impl.Component_PackageImpl#getUtilityNodes()
		 * @generated
		 */
		EClass UTILITY_NODES = eINSTANCE.getUtilityNodes();

		/**
		 * The meta object literal for the '<em><b>Reading</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UTILITY_NODES__READING = eINSTANCE.getUtilityNodes_Reading();

		/**
		 * The meta object literal for the '{@link component.impl.TransitionNodeImpl <em>Transition Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see component.impl.TransitionNodeImpl
		 * @see component.impl.Component_PackageImpl#getTransitionNode()
		 * @generated
		 */
		EClass TRANSITION_NODE = eINSTANCE.getTransitionNode();

		/**
		 * The meta object literal for the '{@link component.impl.ForkImpl <em>Fork</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see component.impl.ForkImpl
		 * @see component.impl.Component_PackageImpl#getFork()
		 * @generated
		 */
		EClass FORK = eINSTANCE.getFork();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FORK__SOURCE = eINSTANCE.getFork_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FORK__TARGET = eINSTANCE.getFork_Target();

		/**
		 * The meta object literal for the '{@link component.impl.SwitchImpl <em>Switch</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see component.impl.SwitchImpl
		 * @see component.impl.Component_PackageImpl#getSwitch()
		 * @generated
		 */
		EClass SWITCH = eINSTANCE.getSwitch();

		/**
		 * The meta object literal for the '<em><b>Ports</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SWITCH__PORTS = eINSTANCE.getSwitch_Ports();

		/**
		 * The meta object literal for the '{@link component.impl.IONodeImpl <em>IO Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see component.impl.IONodeImpl
		 * @see component.impl.Component_PackageImpl#getIONode()
		 * @generated
		 */
		EClass IO_NODE = eINSTANCE.getIONode();

		/**
		 * The meta object literal for the '<em><b>Upper</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IO_NODE__UPPER = eINSTANCE.getIONode_Upper();

		/**
		 * The meta object literal for the '<em><b>Lower</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IO_NODE__LOWER = eINSTANCE.getIONode_Lower();

		/**
		 * The meta object literal for the '{@link component.impl.InputImpl <em>Input</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see component.impl.InputImpl
		 * @see component.impl.Component_PackageImpl#getInput()
		 * @generated
		 */
		EClass INPUT = eINSTANCE.getInput();

		/**
		 * The meta object literal for the '<em><b>Faulty</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INPUT__FAULTY = eINSTANCE.getInput_Faulty();

		/**
		 * The meta object literal for the '<em><b>Running Normally</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INPUT__RUNNING_NORMALLY = eINSTANCE.getInput_RunningNormally();

		/**
		 * The meta object literal for the '<em><b>Running Abnormally</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INPUT__RUNNING_ABNORMALLY = eINSTANCE.getInput_RunningAbnormally();

		/**
		 * The meta object literal for the '<em><b>To Be Predicted</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INPUT__TO_BE_PREDICTED = eINSTANCE.getInput_ToBePredicted();

		/**
		 * The meta object literal for the '{@link component.impl.OutputImpl <em>Output</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see component.impl.OutputImpl
		 * @see component.impl.Component_PackageImpl#getOutput()
		 * @generated
		 */
		EClass OUTPUT = eINSTANCE.getOutput();

		/**
		 * The meta object literal for the '<em><b>Faulty</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OUTPUT__FAULTY = eINSTANCE.getOutput_Faulty();

		/**
		 * The meta object literal for the '<em><b>Running Normally</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OUTPUT__RUNNING_NORMALLY = eINSTANCE.getOutput_RunningNormally();

		/**
		 * The meta object literal for the '<em><b>Running Abnormally</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OUTPUT__RUNNING_ABNORMALLY = eINSTANCE.getOutput_RunningAbnormally();

		/**
		 * The meta object literal for the '<em><b>To Be Predicted</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OUTPUT__TO_BE_PREDICTED = eINSTANCE.getOutput_ToBePredicted();

		/**
		 * The meta object literal for the '{@link component.impl.LPortImpl <em>LPort</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see component.impl.LPortImpl
		 * @see component.impl.Component_PackageImpl#getLPort()
		 * @generated
		 */
		EClass LPORT = eINSTANCE.getLPort();

		/**
		 * The meta object literal for the '{@link component.impl.RPortImpl <em>RPort</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see component.impl.RPortImpl
		 * @see component.impl.Component_PackageImpl#getRPort()
		 * @generated
		 */
		EClass RPORT = eINSTANCE.getRPort();

		/**
		 * The meta object literal for the '{@link component.impl.FunctionImpl <em>Function</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see component.impl.FunctionImpl
		 * @see component.impl.Component_PackageImpl#getFunction()
		 * @generated
		 */
		EClass FUNCTION = eINSTANCE.getFunction();

		/**
		 * The meta object literal for the '<em><b>Func</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FUNCTION__FUNC = eINSTANCE.getFunction_Func();

		/**
		 * The meta object literal for the '<em><b>Tolerance Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FUNCTION__TOLERANCE_TYPE = eINSTANCE.getFunction_ToleranceType();

		/**
		 * The meta object literal for the '{@link component.impl.ReadingImpl <em>Reading</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see component.impl.ReadingImpl
		 * @see component.impl.Component_PackageImpl#getReading()
		 * @generated
		 */
		EClass READING = eINSTANCE.getReading();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute READING__VALUE = eINSTANCE.getReading_Value();

		/**
		 * The meta object literal for the '<em><b>Upper value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute READING__UPPER_VALUE = eINSTANCE.getReading_Upper_value();

		/**
		 * The meta object literal for the '<em><b>Lower value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute READING__LOWER_VALUE = eINSTANCE.getReading_Lower_value();

		/**
		 * The meta object literal for the '<em><b>Unit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute READING__UNIT = eINSTANCE.getReading_Unit();

		/**
		 * The meta object literal for the '{@link component.impl.ComponentSafetyElementImpl <em>Component Safety Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see component.impl.ComponentSafetyElementImpl
		 * @see component.impl.Component_PackageImpl#getComponentSafetyElement()
		 * @generated
		 */
		EClass COMPONENT_SAFETY_ELEMENT = eINSTANCE.getComponentSafetyElement();

		/**
		 * The meta object literal for the '<em><b>Identity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPONENT_SAFETY_ELEMENT__IDENTITY = eINSTANCE.getComponentSafetyElement_Identity();

		/**
		 * The meta object literal for the '{@link component.impl.FailureModeImpl <em>Failure Mode</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see component.impl.FailureModeImpl
		 * @see component.impl.Component_PackageImpl#getFailureMode()
		 * @generated
		 */
		EClass FAILURE_MODE = eINSTANCE.getFailureMode();

		/**
		 * The meta object literal for the '<em><b>Mode</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FAILURE_MODE__MODE = eINSTANCE.getFailureMode_Mode();

		/**
		 * The meta object literal for the '<em><b>Cause</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FAILURE_MODE__CAUSE = eINSTANCE.getFailureMode_Cause();

		/**
		 * The meta object literal for the '<em><b>Probability</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FAILURE_MODE__PROBABILITY = eINSTANCE.getFailureMode_Probability();

		/**
		 * The meta object literal for the '<em><b>Safety related</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FAILURE_MODE__SAFETY_RELATED = eINSTANCE.getFailureMode_Safety_related();

		/**
		 * The meta object literal for the '<em><b>Failure Severity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FAILURE_MODE__FAILURE_SEVERITY = eINSTANCE.getFailureMode_FailureSeverity();

		/**
		 * The meta object literal for the '<em><b>Hazards</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FAILURE_MODE__HAZARDS = eINSTANCE.getFailureMode_Hazards();

		/**
		 * The meta object literal for the '<em><b>Regional</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FAILURE_MODE__REGIONAL = eINSTANCE.getFailureMode_Regional();

		/**
		 * The meta object literal for the '<em><b>Higher level</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FAILURE_MODE__HIGHER_LEVEL = eINSTANCE.getFailureMode_Higher_level();

		/**
		 * The meta object literal for the '<em><b>Final</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FAILURE_MODE__FINAL = eINSTANCE.getFailureMode_Final();

		/**
		 * The meta object literal for the '{@link component.impl.SafetyMechanismImpl <em>Safety Mechanism</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see component.impl.SafetyMechanismImpl
		 * @see component.impl.Component_PackageImpl#getSafetyMechanism()
		 * @generated
		 */
		EClass SAFETY_MECHANISM = eINSTANCE.getSafetyMechanism();

		/**
		 * The meta object literal for the '<em><b>Handle</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SAFETY_MECHANISM__HANDLE = eINSTANCE.getSafetyMechanism_Handle();

		/**
		 * The meta object literal for the '<em><b>Mechanism</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SAFETY_MECHANISM__MECHANISM = eINSTANCE.getSafetyMechanism_Mechanism();

		/**
		 * The meta object literal for the '<em><b>Coverage</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SAFETY_MECHANISM__COVERAGE = eINSTANCE.getSafetyMechanism_Coverage();

		/**
		 * The meta object literal for the '<em><b>Costs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SAFETY_MECHANISM__COSTS = eINSTANCE.getSafetyMechanism_Costs();

		/**
		 * The meta object literal for the '{@link component.impl.CostImpl <em>Cost</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see component.impl.CostImpl
		 * @see component.impl.Component_PackageImpl#getCost()
		 * @generated
		 */
		EClass COST = eINSTANCE.getCost();

		/**
		 * The meta object literal for the '<em><b>Unit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COST__UNIT = eINSTANCE.getCost_Unit();

		/**
		 * The meta object literal for the '<em><b>Cost</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COST__COST = eINSTANCE.getCost_Cost();

		/**
		 * The meta object literal for the '{@link component.impl.FailureEffectImpl <em>Failure Effect</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see component.impl.FailureEffectImpl
		 * @see component.impl.Component_PackageImpl#getFailureEffect()
		 * @generated
		 */
		EClass FAILURE_EFFECT = eINSTANCE.getFailureEffect();

		/**
		 * The meta object literal for the '<em><b>Effect</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FAILURE_EFFECT__EFFECT = eINSTANCE.getFailureEffect_Effect();

		/**
		 * The meta object literal for the '<em><b>Affected</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FAILURE_EFFECT__AFFECTED = eINSTANCE.getFailureEffect_Affected();

		/**
		 * The meta object literal for the '{@link component.impl.RegionalEffectImpl <em>Regional Effect</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see component.impl.RegionalEffectImpl
		 * @see component.impl.Component_PackageImpl#getRegionalEffect()
		 * @generated
		 */
		EClass REGIONAL_EFFECT = eINSTANCE.getRegionalEffect();

		/**
		 * The meta object literal for the '{@link component.impl.HigherLevelEffectImpl <em>Higher Level Effect</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see component.impl.HigherLevelEffectImpl
		 * @see component.impl.Component_PackageImpl#getHigherLevelEffect()
		 * @generated
		 */
		EClass HIGHER_LEVEL_EFFECT = eINSTANCE.getHigherLevelEffect();

		/**
		 * The meta object literal for the '{@link component.impl.FinalEffectImpl <em>Final Effect</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see component.impl.FinalEffectImpl
		 * @see component.impl.Component_PackageImpl#getFinalEffect()
		 * @generated
		 */
		EClass FINAL_EFFECT = eINSTANCE.getFinalEffect();

		/**
		 * The meta object literal for the '{@link component.FailureSeverity <em>Failure Severity</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see component.FailureSeverity
		 * @see component.impl.Component_PackageImpl#getFailureSeverity()
		 * @generated
		 */
		EEnum FAILURE_SEVERITY = eINSTANCE.getFailureSeverity();

		/**
		 * The meta object literal for the '{@link component.ComponentType <em>Component Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see component.ComponentType
		 * @see component.impl.Component_PackageImpl#getComponentType()
		 * @generated
		 */
		EEnum COMPONENT_TYPE = eINSTANCE.getComponentType();

		/**
		 * The meta object literal for the '{@link component.ToleranceType <em>Tolerance Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see component.ToleranceType
		 * @see component.impl.Component_PackageImpl#getToleranceType()
		 * @generated
		 */
		EEnum TOLERANCE_TYPE = eINSTANCE.getToleranceType();

		/**
		 * The meta object literal for the '{@link component.FailureEffectEnum <em>Failure Effect Enum</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see component.FailureEffectEnum
		 * @see component.impl.Component_PackageImpl#getFailureEffectEnum()
		 * @generated
		 */
		EEnum FAILURE_EFFECT_ENUM = eINSTANCE.getFailureEffectEnum();

	}

} //Component_Package
