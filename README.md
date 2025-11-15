# Documento de Testes – API Funcionários
Aluna: Andressa Maria

---

## Objetivo
Verificar o funcionamento dos endpoints da API de Funcionários utilizando o Postman.

---

# 1. Teste – Criar Funcionário (POST)

**Endpoint:** POST /funcionarios  
**Corpo enviado:**
```json
{
  "nome": "Ana",
  "cargo": "Gestora",
  "salario": 7000,
  "idade": 35
}
```

**Resultado esperado:**  
- Status 201 ou 200  
- Funcionário salvo no banco  

---

# 2. Teste – Listar Funcionários (GET)

**Endpoint:** GET /funcionarios  
**Resultado esperado:**  
- Status 200  
- Lista com todos os funcionários  

---
# 3. Teste – Atualizar Funcionário (PUT)

**Endpoint:** PUT /funcionarios/{id}  
**Corpo enviado:**
```json
{
  "nome": "Ana Souza",
  "cargo": "Gestora Senior",
  "salario": 8200,
  "idade": 36
}
```

**Resultado esperado:**  
- Status 200  
- Dados atualizados corretamente  

---

# 4. Teste – Excluir Funcionário (DELETE)

**Endpoint:** DELETE /funcionarios/{id}  
**Resultado esperado:**  
- Status 204  
- Funcionário removido  

---

## Conclusão
A API foi testada e apresenta funcionamento adequado para operações CRUD.
