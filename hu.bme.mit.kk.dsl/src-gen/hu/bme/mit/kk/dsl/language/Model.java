/**
 */
package hu.bme.mit.kk.dsl.language;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hu.bme.mit.kk.dsl.language.Model#getPeople <em>People</em>}</li>
 *   <li>{@link hu.bme.mit.kk.dsl.language.Model#getStatements <em>Statements</em>}</li>
 * </ul>
 *
 * @see hu.bme.mit.kk.dsl.language.LanguagePackage#getModel()
 * @model
 * @generated
 */
public interface Model extends EObject
{
  /**
   * Returns the value of the '<em><b>People</b></em>' containment reference list.
   * The list contents are of type {@link hu.bme.mit.kk.dsl.language.Person}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>People</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>People</em>' containment reference list.
   * @see hu.bme.mit.kk.dsl.language.LanguagePackage#getModel_People()
   * @model containment="true"
   * @generated
   */
  EList<Person> getPeople();

  /**
   * Returns the value of the '<em><b>Statements</b></em>' containment reference list.
   * The list contents are of type {@link hu.bme.mit.kk.dsl.language.Statement}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Statements</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Statements</em>' containment reference list.
   * @see hu.bme.mit.kk.dsl.language.LanguagePackage#getModel_Statements()
   * @model containment="true"
   * @generated
   */
  EList<Statement> getStatements();

} // Model
